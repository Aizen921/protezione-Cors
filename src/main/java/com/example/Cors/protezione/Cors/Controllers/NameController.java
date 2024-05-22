package com.example.Cors.protezione.Cors.Controllers;

import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/home")
    @CrossOrigin(origins = "*")
    public class NameController {
        @GetMapping("/name")
        public String getName(@RequestParam String name){
            return name;
        }
        @PostMapping("/name")
        public String revName(@RequestBody String name){
            return new StringBuilder(name).reverse().toString();
        }
    }

