package com.br.api.mapper;

import com.br.api.controller.response.HabilidadeResponse;
import com.br.api.domain.Habilidade;

public class HabilidadeMapper {
    public static HabilidadeResponse toResponse(Habilidade entity) {
        return HabilidadeResponse.builder()
                .id(entity.getId())
                .curso(entity.getCurso())
                .ativo(entity.getAtivo())
                .nome(entity.getNome())
                .nivelMinimo(entity.getNivelMinimo())
                .incrementoDinheiro(entity.getIncrementoDinheiro())
                .build();
    }
}
