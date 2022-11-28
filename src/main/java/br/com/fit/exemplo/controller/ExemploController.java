package br.com.fit.exemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {
    @GetMapping("/test")
    public String test() {
        return "it works!";
    }
}
