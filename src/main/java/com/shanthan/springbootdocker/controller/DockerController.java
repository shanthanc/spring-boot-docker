package com.shanthan.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/v1/greeting")
    public String greeting() {
        return "Good job deploying basic spring-boot app on docker!";
    }
}
