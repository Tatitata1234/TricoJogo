package com.br.api.domain;


import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

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
    @ManyToOne
    @JoinColumn(name = "tipo_objetivo")
    TipoObjetivo tipoObjetivo;
    String objetivo;
    Integer nivelMinimo;
    Integer premio;
    @ManyToOne
    @JoinColumn(name = "tipo_premio")
    TipoPremio tipoPremio;
    String ativo;

    @ManyToOne
    @JoinColumn(name = "usuario_ID")
    private Usuario usuario;

}
