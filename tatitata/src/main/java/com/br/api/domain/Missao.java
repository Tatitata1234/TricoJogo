package com.br.api.domain;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Missao {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;
    String nome;
    String descricao;
    TipoObjetivo tipoObjetivo;
    String objetivo;
    Integer nivelMinimo;
    Integer premio;
    TipoPremio tipoPremio;
    String ativo;
}
