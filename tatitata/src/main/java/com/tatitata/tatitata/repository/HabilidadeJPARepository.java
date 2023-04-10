package com.tatitata.tatitata.repository;

import com.tatitata.tatitata.model.Habilidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabilidadeJPARepository extends JpaRepository<Habilidade,Long> {

    List<Habilidade> findAll();
}
