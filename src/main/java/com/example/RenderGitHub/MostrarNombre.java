package com.example.RenderGitHub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class MostrarNombre {

    @GetMapping("/{nombre}")
    public String obtenerNombre(@PathVariable String nombre){
        return nombre;
    }
}
