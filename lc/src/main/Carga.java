package main;

public abstract class Carga extends Vehiculo {

	private int pma;
	
	// constructor
	
	public Carga(String matricula, int numeroPlazas, int pma) {
		// llamamos al constructor del papi
		super(matricula, numeroPlazas);
		// y hacemos nuestra operacion
		setPma(pma);
	}

	@Override
	public abstract int getPrecioAlquiler();

	@Override
	protected int getPrecioAlquilerBasico() {
		return super.getPrecioAlquilerBasico() + 20 * pma;
	}

	public int getPma() {
		return pma;
	}

	public void setPma(int pma) {
		this.pma = pma;
	}
	
	
}
