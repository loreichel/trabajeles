package main;

public abstract class Vehiculo implements IVehiculo {
	// atributos
	private String matricula;
	private int numeroDias;
	private int numeroPlazas;

	// constructores

	public Vehiculo(String matricula, int numeroPlazas) {
		setMatricula(matricula);
		setNumeroPlazas(numeroPlazas);
	}

	// getters
	public String getMatricula() {
		return matricula;
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	// setters
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	protected int getPrecioAlquilerBasico() {
		return getNumeroDias() * 50;
	}

	// otros metodos (getPrecioAlquiler podria llamarse calcularPrecioAlquiler)
	public abstract int getPrecioAlquiler();
	
	@Override
	public String toString(){
		return "[Matricula: " + matricula + 
				" ; Num dias: " + numeroDias
				+ " ; Num plazas: " + numeroPlazas + "]";
	}

}
