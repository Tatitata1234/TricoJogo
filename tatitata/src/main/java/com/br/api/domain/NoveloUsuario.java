package com.br.api.domain;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class NoveloUsuario {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "novelo")
    private Novelo novelo;
    private Integer tamanho;
    private String ativo;
}
