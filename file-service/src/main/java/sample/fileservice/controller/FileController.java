package sample.fileservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

    @PostMapping("files")
    public String saveFile(MultipartFile file) {
        return file.getOriginalFilename();
    }
}
