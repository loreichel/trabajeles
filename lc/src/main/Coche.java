package main;

public class Coche extends Vehiculo {

	public Coche(String matricula, int numeroPlazas) {
		super(matricula, numeroPlazas);
	}

	@Override
	public int getPrecioAlquiler() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString(){
		return "Coche: \n\t" + super.toString();
	}

}
