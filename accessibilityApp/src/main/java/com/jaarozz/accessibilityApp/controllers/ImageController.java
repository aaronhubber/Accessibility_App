package com.jaarozz.accessibilityApp.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import com.jaarozz.accessibilityApp.models.ImageEntity;
import com.jaarozz.accessibilityApp.models.ImageResponse;
import com.jaarozz.accessibilityApp.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;



@RestController
@RequestMapping("images")
public class ImageController {

    private final ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping
    public ResponseEntity<String> upload(@RequestParam("image") MultipartFile image) {
        try {
            imageService.save(image);

            return ResponseEntity.status(HttpStatus.OK)
                    .body(String.format("Image uploaded successfully: %s", image.getOriginalFilename()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(String.format("Could not upload the image: %s!", image.getOriginalFilename()));
        }
    }

    @GetMapping
    public List<ImageResponse> list() {
        return imageService.getAllImages()
                .stream()
                .map(this::mapToImageResponse)
                .collect(Collectors.toList());
    }

    private ImageResponse mapToImageResponse(ImageEntity imageEntity) {
        String downloadURL = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/images/")
                .path(imageEntity.getId())
                .toUriString();
        ImageResponse imageResponse = new ImageResponse();
        imageResponse.setId(imageEntity.getId());
        imageResponse.setName(imageEntity.getName());
        imageResponse.setContentType(imageEntity.getContentType());
        imageResponse.setSize(imageEntity.getSize());
        imageResponse.setUrl(downloadURL);

        return imageResponse;
    }

    @GetMapping("{id}")
    public ResponseEntity<byte[]> getImage(@PathVariable String id) {
        Optional<ImageEntity> imageEntityOptional = imageService.getImage(id);

        if (!imageEntityOptional.isPresent()) {
            return ResponseEntity.notFound()
                    .build();
        }

        ImageEntity imageEntity = imageEntityOptional.get();
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + imageEntity.getName() + "\"")
                .contentType(MediaType.valueOf(imageEntity.getContentType()))
                .body(imageEntity.getData());
    }
}
