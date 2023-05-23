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
public class MissaoUsuario {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "missao")
    private Missao missao;
    private int progresso;
}
