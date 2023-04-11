package com.br.api.controller.response;

import com.br.api.domain.Curso;
import lombok.*;

import java.math.BigDecimal;

@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class HabilidadeResponse {
    private Long id;
    private String nome;
    private BigDecimal incrementoDinheiro;
    private int nivelMinimo;
    private String ativo;
    private Curso curso;
}
