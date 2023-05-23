package com.br.api.domain;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

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
    @ManyToOne
    @JoinColumn(name = "receita")
    private Receita receita;
    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;
    private String ativo;
}
