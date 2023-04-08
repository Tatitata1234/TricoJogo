package com.tatitata.tatitata.model;

import jakarta.persistence.GeneratedValue;
import lombok.*;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

import static jakarta.persistence.GenerationType.IDENTITY;

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
}
