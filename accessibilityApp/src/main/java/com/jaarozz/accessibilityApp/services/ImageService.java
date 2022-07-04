package com.jaarozz.accessibilityApp.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


import com.jaarozz.accessibilityApp.models.ImageEntity;

import com.jaarozz.accessibilityApp.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


@Service
public class ImageService {

    private final ImageRepository imageRepository;

    @Autowired
    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public void save(MultipartFile image) throws IOException {
        ImageEntity imageEntity = new ImageEntity();
        imageEntity.setName(StringUtils.cleanPath(image.getOriginalFilename()));
        imageEntity.setContentType(image.getContentType());
        imageEntity.setData(image.getBytes());
        imageEntity.setSize(image.getSize());

        imageRepository.save(imageEntity);
    }

    public Optional<ImageEntity> getImage(String id) {
        return imageRepository.findById(id);
    }

    public List<ImageEntity> getAllImages() {
        return imageRepository.findAll();
    }
}