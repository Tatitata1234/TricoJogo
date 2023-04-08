package com.tatitata.tatitata.controller;

import com.tatitata.tatitata.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UsuarioController {
    @GetMapping()
    public ResponseEntity<List<Usuario>> teste(){
        return new ResponseEntity<List<Usuario>>(null);
    }
}
