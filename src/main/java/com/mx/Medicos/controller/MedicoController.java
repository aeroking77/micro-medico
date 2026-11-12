package com.mx.Medicos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Medicos.dto.Respuesta;
import com.mx.Medicos.entidad.Medico;
import com.mx.Medicos.service.MedicoService;

@RestController
@RequestMapping("medicos")
@CrossOrigin
public class MedicoController {
    final MedicoService service;

    MedicoController(MedicoService service) {
        this.service = service;
    }
    
    @GetMapping("listar")
    public ResponseEntity<?> listar(){
    	return service.listar();
    }
    
    @PostMapping("guardar")
    public Respuesta guardar(@RequestBody Medico medico) {
    	return service.guardar(medico);
    }
    
    @PostMapping("editar")
    public Respuesta editar(@RequestBody Medico medico) {
    	return service.editar(medico);
    }
    
    @GetMapping("eliminar/{numero}")
    public Respuesta eliminar(@PathVariable("numero")long numero) {
    	return service.eliminar(numero);
    }
    
    @GetMapping("buscar/{numero}")
    public ResponseEntity<?> buscar(@PathVariable("numero")long numero){
    	return service.buscar(numero);
    }
    
    @GetMapping("buscarMedicos/{numero}")
    public ResponseEntity<?> buscar(@PathVariable("numero")int numero){
    	return service.buscarMedicosPorClinica(numero);
    }
    
    @GetMapping("buscarPacientes/{numero}")
    public ResponseEntity<?> buscarPacientes(@PathVariable("numero")long numero){
    	return service.buscarPacientes(numero);
    }
}
