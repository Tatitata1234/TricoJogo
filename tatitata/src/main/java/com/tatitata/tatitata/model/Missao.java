package com.tatitata.tatitata.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import static jakarta.persistence.GenerationType.IDENTITY;

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
