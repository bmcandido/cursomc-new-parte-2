package com.brunocandido.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunocandido.cursomc.domain.Categoria;

@Repository
public interface SexoRepository extends JpaRepository<Categoria, Integer> {

}
