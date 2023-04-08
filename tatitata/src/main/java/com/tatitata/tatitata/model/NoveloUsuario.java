package com.tatitata.tatitata.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import static jakarta.persistence.GenerationType.IDENTITY;

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
