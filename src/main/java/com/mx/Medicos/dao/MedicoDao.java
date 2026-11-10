package com.mx.Medicos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Medicos.entidad.Medico;
import java.util.List;


public interface MedicoDao extends JpaRepository<Medico, Long> {
    List<Medico> findByNumeroClinica(int numeroClinica);
}
