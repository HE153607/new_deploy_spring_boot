package com.boyka.demo;

import io.minio.MinioClient;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableTransactionManagement
public class DemoApplication implements CommandLineRunner {

    @Bean
    public MinioClient minioClient(){
        return MinioClient.builder()
                .credentials("minioadmin","minioadmin")
                .endpoint("https://play.min.io").build();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {

    }

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        return modelMapper;
    }

//    @Bean
//    CacheManager cacheManager(){
//        ConcurrentMapCacheManager cache = new ConcurrentMapCacheManager();
//        cache.setCacheNames(Arrays.asList(""));
//
//        return cache;
//    }

}
