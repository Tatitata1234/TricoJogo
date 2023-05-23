package com.br.api.domain;

import lombok.*;

import javax.persistence.*;
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
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "receita")
    private Receita receita;

    @ManyToOne
    @JoinColumn(name = "usuario_ID")
    private Usuario usuario;

}
