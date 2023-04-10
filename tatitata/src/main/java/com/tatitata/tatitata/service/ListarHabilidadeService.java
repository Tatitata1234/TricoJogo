package com.tatitata.tatitata.service;

import com.tatitata.tatitata.model.Habilidade;
import com.tatitata.tatitata.repository.HabilidadeJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarHabilidadeService {
    @Autowired
    private HabilidadeJPARepository habilidadeJPARepository;
    public List<Habilidade> listar() {
        List<Habilidade> habilidades = habilidadeJPARepository.findAll();
        return habilidades;
    }
}
