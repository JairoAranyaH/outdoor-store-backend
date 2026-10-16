package com.outdoor.store.common;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
@RequestMapping("/api")

public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health(){
        return Map.of(
            "status", "ok",
                "app", "Andes Outdoor"
        );
    }

    @GetMapping("/hello")
    public Map<String, String> hello(@RequestParam(defaultValue = "visitante")String name){
        return Map.of("message","hola, " + name);
    }


}
