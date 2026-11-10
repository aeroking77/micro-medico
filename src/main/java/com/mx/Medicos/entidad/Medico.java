package com.mx.Medicos.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MEDICOS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medico {
	@Id
	private long numero;
	private String nombre;
	private String apellido;
	private String genero;
	private int edad;
	private String especilidad;
	private String area;
	private int numeroClinica;
	
}
