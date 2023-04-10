package com.br.api.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Novelo {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String malha;
    private Integer tamanhoPadrao;
    private Integer preco;
    private BigDecimal incrementoDinheiro;
    private String cor;
    private String ativo;
}
