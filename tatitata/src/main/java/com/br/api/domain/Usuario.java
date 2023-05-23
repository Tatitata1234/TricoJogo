package com.br.api.domain;

import lombok.*;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;
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
    private boolean ativo;
    private String email;
    private String senha;
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
    @OneToMany(mappedBy = "usuario", cascade = ALL, fetch = EAGER)
    private List<Permissao> permissoes = new ArrayList<>();

    public void adicionarPermissao(Permissao permissao) {
        this.permissoes.add(permissao);
        permissao.setUsuario(this);
    }
}
