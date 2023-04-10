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
public class TipoPremio {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String nome;
}
