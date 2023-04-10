package com.br.api.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Habilidade {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String nome;
    private BigDecimal incrementoDinheiro;
    private int nivelMinimo;
    private String ativo;
    private Curso curso;
}
