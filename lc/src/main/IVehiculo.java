package main;

public interface IVehiculo {

	String getMatricula();
	int getNumeroDias();
	int getNumeroPlazas();
	
	void setMatricula(String matricula);
	void setNumeroDias(int numeroDias);
	void setNumeroPlazas(int numeroPlazas);
	
	int getPrecioAlquiler();
	
}
