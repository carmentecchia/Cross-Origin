package com.example.Cross.Origin;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST})

public class NameController {
    @GetMapping("/getName")
    public String getName(@RequestParam String name) {
        return "Nome: " + name;
    }
    @PostMapping("/reverseName")
    public String reverseName(@RequestParam String name) {
        StringBuilder reversedName = new StringBuilder(name).reverse();
        return "Nome al contrario: " + reversedName.toString();
    }
}