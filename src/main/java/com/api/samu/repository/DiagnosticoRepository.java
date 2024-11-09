package com.api.samu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.samu.entities.Diagnostico;
@Repository
public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Integer> {
    public Diagnostico findById(int id);
}
