package com.microservice.tutorial.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/user-service-fallback")
    public String userServiceFallbackMethod() {
        return "User service is taking longer than expected, please try again later";
    }

    @GetMapping("/department-service-fallback")
    public String departmentServiceFallbackMethod() {
        return "Department service is taking longer than expected, please try again later";
    }
}
