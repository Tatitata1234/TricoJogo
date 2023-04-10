package com.br.api.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Trico {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String nome;
    private Integer preco;
    private String vendido;
    private Receita receita;
    private Usuario usuario;
    private String ativo;
}
