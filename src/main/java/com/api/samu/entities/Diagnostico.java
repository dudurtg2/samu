package com.api.samu.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "diagnosticos")
public class Diagnostico {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "link_diagnostico")
    private String link_diagnostico;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink_diagnostico() {
        return this.link_diagnostico;
    }

    public void setLink_diagnostico(String link_diagnostico) {
        this.link_diagnostico = link_diagnostico;
    }

    public Diagnostico() {
    }


    public Diagnostico(int id, String link_diagnostico) {
        this.id = id;
        this.link_diagnostico = link_diagnostico;
    }

}
