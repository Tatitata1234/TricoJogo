package com.br.api.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class NoveloUsuario {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private Usuario usuario;
    private Novelo novelo;
    private Integer tamanho;
    private String ativo;
}
