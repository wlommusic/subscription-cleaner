package com.Dipta.SubscriptionCleaner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HealthCheckController {
    @GetMapping("/health")
    public Map<String,String> doHC(){
    Map<String,String> response = new HashMap<>();
    response.put("status","UP");
    response.put("message","application is running");
    return response;
    }
}
