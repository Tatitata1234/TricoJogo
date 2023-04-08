package com.tatitata.tatitata.model;

import lombok.*;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
}
