package ec.edu.ec.pw.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
@Entity
public class Departamentos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="dep_idDepartamento")
	private int idDepartamento;
	
	@Column(name="dep_numBanos")
	private int numBanos ;
	
	@Column(name="dep_numHabitaciones")
	private int numHabitaciones;
	
	@Column(name="dep_numCarros")
	private int numCarros;
	
	@Column(name="dep_numPisos")
	private int numPisos;
	
	
	public int getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public int getNumBanos() {
		return numBanos;
	}
	public void setNumBanos(int numBanos) {
		this.numBanos = numBanos;
	}
	public int getNumHabitaciones() {
		return numHabitaciones;
	}
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}
	public int getNumCarros() {
		return numCarros;
	}
	public void setNumCarros(int numCarros) {
		this.numCarros = numCarros;
	}
	public int getNumPisos() {
		return numPisos;
	}
	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}
	
	
	
}