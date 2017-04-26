package main;

public class Empresa {
	private static IVehiculo[] flota = new IVehiculo[4];

	public static void main(String[] args) {
		// TODO cada item del array debe ser un tipo de vehiculo distinto

		// if (args.length < 2)
		// System.out.println("Introduzca el numero de la matricula y el numero
		// de dias");

		// else{

		flota[0] = new Coche("blahdsiho15", 3);
		flota[1] = new Furgoneta("3rtycvhbn", 5, 345);
		
		mostrarFlota();

		// TODO Obtener datos de matricula y dias por entrada de usuario
		
		// obtenerPrecioAlquiler(args[0], new Integer(args[1]));

		String matricula = "";
		int numDias = 0;
		obtenerPrecioAlquiler(matricula, numDias);
	}
	// }

	private static void obtenerPrecioAlquiler(String matricula, int numDias) {
		for (int i = 0; i < flota.length; i++) {
			if (flota[i].getMatricula().equals(matricula)) {
				flota[i].setNumeroDias(numDias);
				System.out.println(flota[i].getPrecioAlquiler());
			}
		}

	}

	private static void mostrarFlota() {

		for (int i = 0; i < flota.length; i++) {
			System.out.println(flota[i]);
		}

	}

}
