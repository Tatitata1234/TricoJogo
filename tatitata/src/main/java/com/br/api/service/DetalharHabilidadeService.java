package com.br.api.service;

import com.br.api.controller.response.HabilidadeResponse;
import com.br.api.domain.Habilidade;
import com.br.api.repository.HabilidadeJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;

import static com.br.api.mapper.HabilidadeMapper.toResponse;
import static org.springframework.http.HttpStatus.NO_CONTENT;

public class DetalharHabilidadeService {

    @Autowired
    private HabilidadeJPARepository habilidadeJPARepository;

    public HabilidadeResponse detalhar(Long habilidadeId) {
        Habilidade habilidade = habilidadeJPARepository.findByIdAndAtivoTrue(habilidadeId);

        if(Objects.isNull(habilidade)){
            throw new RuntimeException(new ResponseStatusException(NO_CONTENT));
        }

        return toResponse(habilidade);
    }
}
