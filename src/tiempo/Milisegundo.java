package tiempo;
/**
 * 
 * @author Juan Carlos Marco y Juan Luis Pérez
 *
 */
public class Milisegundo {
	private long milisegundosactuales;
	private long milisegundos;

	/**
	 * este metodo cuenta milisegundos y devuelve 1 cuando se cuenta un segundo
	 * 
	 * @return Si ha transcurrido un segundo
	 */
	public int devuelveSegundo() {
		milisegundosactuales = System.currentTimeMillis();// Variable para
															// obtener el tiempo
															// al abrir el
															// programa
		int segundo = 0;
		while (segundo < 2) {
			milisegundos = System.currentTimeMillis();// Metodo para obtener el
														// tiempo actual
			if (milisegundosactuales == milisegundos) {
				milisegundosactuales = milisegundos + 1000;// 1000 milisegundos
															// = 1 segundo

				// System.out.println(segundo);
				segundo++;
			} else if ((milisegundosactuales + 1000) < milisegundos)// Metodo
																	// para
																	// evitar
																	// que se
																	// detenga
																	// el
																	// contador
				milisegundosactuales = System.currentTimeMillis();
		}
		return 1;

	}
}
