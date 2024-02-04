package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Try {
    @GetMapping(path = "")
    String say()
    {
        return "FUCK YOU!";
    }
}
