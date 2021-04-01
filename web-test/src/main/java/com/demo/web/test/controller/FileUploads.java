package com.demo.web.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * FileUploads
 *
 * @author LLH
 * @since 四月/01/2021 星期四
 */
@Slf4j
@Controller
@RequestMapping(value = "file", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(allowedHeaders = "*", origins = "*", methods = {RequestMethod.POST,RequestMethod.PUT,RequestMethod.GET,RequestMethod.OPTIONS,RequestMethod.DELETE})
public class FileUploads {
    
    @PostMapping("upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile multipartFile) {
        new File("./tmp").mkdirs();
        return multipartFile.getOriginalFilename();
    }
}
