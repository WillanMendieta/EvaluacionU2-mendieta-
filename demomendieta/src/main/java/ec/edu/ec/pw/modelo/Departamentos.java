package ec.edu.ec.pw.modelo;

import java.io.Serializable;



public class Departamentos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idDepartamento;
	private int numBanos ;
	private int numHabitaciones;
	private int numCarros;
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