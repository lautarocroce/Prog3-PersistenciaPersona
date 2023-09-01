package com.utn.ejer01.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<com.utn.ejer01.entidades.Persona,Long> {
}
