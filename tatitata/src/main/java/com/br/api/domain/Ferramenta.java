package com.br.api.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ferramenta {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String nome;
    private BigDecimal incrementoDinheiro;
    private Integer preco;
    private Integer nivelMinimo;
    private String ativo;

    @ManyToOne
    @JoinColumn(name = "receita")
    private Receita receita;

}
