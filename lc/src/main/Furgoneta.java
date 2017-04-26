package main;

public class Furgoneta extends Carga {

	public Furgoneta(String matricula, int numeroPlazas, int pma) {
		super(matricula, numeroPlazas, pma);
	}

	@Override
	public int getPrecioAlquiler() {
		return super.getPrecioAlquilerBasico();
	}

}
