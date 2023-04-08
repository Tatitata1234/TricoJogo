package com.tatitata.tatitata.model;

import jakarta.persistence.GeneratedValue;
import lombok.*;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import static jakarta.persistence.GenerationType.IDENTITY;

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
