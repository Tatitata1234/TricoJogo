package com.br.api.service;

import com.br.api.repository.HabilidadeJPARepository;
import com.br.api.domain.Habilidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListarHabilidadeService {
    @Autowired
    private HabilidadeJPARepository habilidadeJPARepository;
    public List<String> listar() {
        List<Habilidade> habilidades = habilidadeJPARepository.findAll();
        return habilidades.stream().map(Habilidade::getNome).collect(Collectors.toList());
    }
}
