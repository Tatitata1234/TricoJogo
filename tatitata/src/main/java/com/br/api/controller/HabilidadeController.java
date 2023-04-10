package com.br.api.controller;

import com.br.api.service.ListarHabilidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/habilidades")
public class HabilidadeController {

    @Autowired
    private ListarHabilidadeService listarHabilidadeService;

    @GetMapping("/oi")
    public List<String> listar(){
        return listarHabilidadeService.listar();
    }
    @GetMapping("/teste")
    public String teste(){
        //return new ResponseEntity<List<Usuario>>(null);
        return "oi";
    }

}
