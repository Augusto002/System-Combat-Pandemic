package com.example.SystemCombatPandemic.repository;

import com.example.SystemCombatPandemic.entity.Recursos;
import org.springframework.data.jpa.repository.JpaRepository;

//AQUI É a interface onde vai chamar os metos do JPA

public interface RecursoRepository extends JpaRepository<Recursos,Long> {



}
