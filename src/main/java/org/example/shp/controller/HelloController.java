package org.example.shp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HelloController {

    @GetMapping
    public String test() {
        return "안녕!!!!!!!!!!!!!!!!";
    }

    @GetMapping("/shp2")
    public String test2() {
        return "안녕22222!!!!!!!!!!!!!!!!";
    }
}
