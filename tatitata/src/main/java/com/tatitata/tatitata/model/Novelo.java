package com.tatitata.tatitata.model;

import jakarta.persistence.GeneratedValue;
import lombok.*;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

import static jakarta.persistence.GenerationType.IDENTITY;

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
