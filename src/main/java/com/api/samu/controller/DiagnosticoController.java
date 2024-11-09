package com.api.samu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.api.samu.entities.Diagnostico;
import com.api.samu.repository.DiagnosticoRepository;

@RestController 
@RequestScope
@RequestMapping("/diagnostico")
public class DiagnosticoController {
    DiagnosticoRepository diagnosticoRepository;

    @Autowired
    public DiagnosticoController(DiagnosticoRepository diagnosticoRepository) {
        this.diagnosticoRepository = diagnosticoRepository;
    }

    @PostMapping("/save")
    public ResponseEntity<Diagnostico> save(@RequestBody Diagnostico diagnostico) {
        Diagnostico savedDiagnostico = diagnosticoRepository.save(diagnostico);
        return new ResponseEntity<Diagnostico>(savedDiagnostico, HttpStatus.CREATED); 
    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Diagnostico>> findAll() {
        Iterable<Diagnostico> diagnostico = diagnosticoRepository.findAll();
        return new ResponseEntity<Iterable<Diagnostico>>(diagnostico, HttpStatus.OK); 
    }
    @GetMapping("/findById")
    public ResponseEntity<Diagnostico> findById(int id) {
        Diagnostico diagnostico = diagnosticoRepository.findById(id);
        return new ResponseEntity<Diagnostico>(diagnostico, HttpStatus.OK); 
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Diagnostico> update(@RequestBody Diagnostico diagnostico, int id) {
        Diagnostico diagnosticos = this.diagnosticoRepository.findById(id);
        diagnosticos.setLink_diagnostico(diagnostico.getLink_diagnostico());
        
       
        return new ResponseEntity<Diagnostico>(diagnosticoRepository.save(diagnosticos), HttpStatus.OK);
    }
    

    
}
