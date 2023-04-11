package com.br.api.repository;

import com.br.api.domain.Habilidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HabilidadeJPARepository extends JpaRepository<Habilidade,Long> {

    List<Habilidade> findAllbyAtivoTrue();

    Habilidade findByIdAndAtivoTrue(Long habilidadeId);
}
