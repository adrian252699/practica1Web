package com.example.MiprimerServidorDeAplicacion;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class HomeController {
    @GetMapping("/hello")
    public String hello(){
        return "Hola mundo desde mi servidor de aplicacion";
    }

    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre){
        return "Hola: " + nombre + " desde mi servidor";
    }

    @PostMapping("/mensaje")
    public String recibirMensaje(@RequestBody String mensaje){
        return "Recibi tu mensaje: " + mensaje;

    }
}
