package com.br.api.controller;

import com.br.api.controller.response.HabilidadeResponse;
import com.br.api.service.DetalharHabilidadeService;
import com.br.api.service.ListarHabilidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/habilidades")
public class HabilidadeController {

    @Autowired
    private ListarHabilidadeService listarHabilidadeService;
    @Autowired
    private DetalharHabilidadeService detalharHabilidadeService;
    
    @GetMapping()
    public ResponseEntity<List<HabilidadeResponse>> listar(){
        return ResponseEntity.ok(listarHabilidadeService.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<HabilidadeResponse> detalhar(@PathVariable Long id){
        return ResponseEntity.ok(detalharHabilidadeService.detalhar(id));
    }

}
