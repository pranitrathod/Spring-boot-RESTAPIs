package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {
@GetMapping(path = "")
public String helloSpringBoot()
{
return "<h1>Hello Spring Boot!</h1>";}
}

