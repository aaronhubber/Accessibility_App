//package com.jaarozz.accessibilityApp.controllers;
//
//import com.jaarozz.accessibilityApp.models.User;
//import com.jaarozz.accessibilityApp.repositories.ImageRepository;
//import com.jaarozz.accessibilityApp.repositories.UserRepository;
//import com.jaarozz.accessibilityApp.services.ImageService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.awt.image.ImageConsumer;
//import java.io.IOException;
//import java.util.List;
//
//@RestController
//public class UserController {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    ImageService imageService;
//
//    @GetMapping(value = "/users")
//    public ResponseEntity<List<User>> getAllUsers(){
//        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
//    }
//
//    @PostMapping(value = "/users")
//    public ResponseEntity<User> postUser(@RequestBody User user){
////                                         @RequestParam("image") MultipartFile image) throws IOException {
////        imageService.save(image);
//        userRepository.save(user);
//        return new ResponseEntity<>(user, HttpStatus.CREATED);
//    }
//
//
//}
