package com.example.ecommerceetapa2.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
public class UploadFileService {

    private String folder = "img\\";

    public String saveImage(MultipartFile file) {
        if(!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                java.nio.file.Path path = java.nio.file.Paths.get(folder + file.getOriginalFilename());
                java.nio.file.Files.write(path, bytes);
                return file.getOriginalFilename();
            } catch (Exception e) {
                return "You failed to upload " + file.getOriginalFilename() + " => " + e.getMessage();
            }
        }
        return "default.png";
    }

    public void deleteImage(String filename){
        String ruta = folder + filename;
        File file = new File(ruta);
        if(file.exists()){
            file.delete();
        }
    }
}
