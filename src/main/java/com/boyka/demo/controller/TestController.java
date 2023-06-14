package com.boyka.demo.controller;

import com.boyka.demo.dto.ProductDTO;
import com.google.common.net.HttpHeaders;
import io.minio.*;
import io.minio.http.Method;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@Slf4j
@RequestMapping("text/api/v1")
public class TestController {


    @Autowired
    MinioClient minioClient;

//        @MessageMapping("/app/chat")
//        @SendTo("/topic/messages")
//        public String send(String message) throws Exception {
//            return "test";
//        }
    @RequestMapping(value = "/createProduct", method = RequestMethod.POST)
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO){
        return ResponseEntity.ok(productDTO);
    }

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public ResponseEntity<?> updateFile() throws Exception{
       minioClient.downloadObject(DownloadObjectArgs.builder()
                       .bucket("64880b68c2de3059b1f0a7a6-files")
                       .object("owl.png")
               .build());
      return ResponseEntity.ok("ok");
    }
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String downloadFile(){
        return "hello world";
    }
}

