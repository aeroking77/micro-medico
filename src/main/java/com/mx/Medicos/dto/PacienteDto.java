package com.mx.Medicos.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PacienteDto {
	private String curp;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String genero;
	private double peso;
	private double altura;
	private int numeroClinica;
	private long numeroMedico;
}
