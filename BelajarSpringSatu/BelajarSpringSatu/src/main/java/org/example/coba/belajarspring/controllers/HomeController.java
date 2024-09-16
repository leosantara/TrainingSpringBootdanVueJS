package org.example.coba.belajarspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/selamatdatang")
public class HomeController {
    @GetMapping
    public String home() {
        return "Selamat datang di home";
    }

    @PostMapping
    public String lainnya(){
        return "Data post";
    }
}
