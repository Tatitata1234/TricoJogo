package com.br.api.domain;

import lombok.*;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String nome;
    private Integer xp;
    private Integer nivel;
    private Integer dinheiro;
    private String ativo;
    @OneToMany(mappedBy = "usuario")
    private List<Habilidade> habilidades = new ArrayList<Habilidade>();
    @OneToMany(mappedBy = "usuario")
    private List<Missao> missoes = new ArrayList<Missao>();
    @OneToMany(mappedBy = "usuario")
    private List<NoveloUsuario> novelos = new ArrayList<NoveloUsuario>();
    @OneToMany(mappedBy = "usuario")
    private List<Ferramenta> ferramentas = new ArrayList<Ferramenta>();
    @OneToMany(mappedBy = "usuario")
    private List<Receita> receitas = new ArrayList<Receita>();
    @OneToMany(mappedBy = "usuario")
    private List<Curso> cursos = new ArrayList<Curso>();
    @OneToMany(mappedBy = "usuario")
    private List<Trico> tricos = new ArrayList<Trico>();
}
