package com.api.samu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.samu.entities.Pacientes;
@Repository
public interface PacientesRepository extends JpaRepository<Pacientes, Integer> {
    public Pacientes findById(int id);
}
