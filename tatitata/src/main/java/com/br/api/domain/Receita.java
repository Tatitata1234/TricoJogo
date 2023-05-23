package com.br.api.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Receita {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String nome;
    private BigDecimal incrementoDinheiro;
    private Integer preco;
    private Integer tamanho;
    private Integer nivelMinimo;
    private String ativo;
    @ManyToOne
    @JoinColumn(name = "curso")
    private Curso curso;
    @OneToMany(mappedBy = "receita")
    private List<Habilidade> habilidades = new ArrayList<Habilidade>();
    @OneToMany(mappedBy = "receita")
    private List<Ferramenta> ferramentas = new ArrayList<Ferramenta>();

    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;

}
