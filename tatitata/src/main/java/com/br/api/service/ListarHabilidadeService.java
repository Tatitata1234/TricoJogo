package com.br.api.service;

import com.br.api.controller.response.HabilidadeResponse;
import com.br.api.mapper.HabilidadeMapper;
import com.br.api.repository.HabilidadeJPARepository;
import com.br.api.domain.Habilidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.NO_CONTENT;

@Service
public class ListarHabilidadeService {
    @Autowired
    private HabilidadeJPARepository habilidadeJPARepository;
    public List<HabilidadeResponse> listar() {
        List<Habilidade> habilidades = habilidadeJPARepository.findAllbyAtivoTrue();

        if(Objects.isNull(habilidades) || habilidades.isEmpty()){
            throw new RuntimeException(new ResponseStatusException(NO_CONTENT));
        }

        return habilidades.stream().map(HabilidadeMapper::toResponse).collect(Collectors.toList());
    }
}
