package com.coworking.cowork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class Saludo {
    @GetMapping("/saludo")
    public String saludar() {
        return "Bienvenido a CoWork API,tu espacio de coworking";
    }
}

