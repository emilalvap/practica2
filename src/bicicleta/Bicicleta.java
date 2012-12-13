package bicicleta;
/**
 * 
 * Bicicleta estándar . Hereda de Vehiculo
 *
 */
public class Bicicleta extends Vehiculo {

	// almacena el numero de pedales, ya que puede haber tandems
	protected int numpedales = 2;

	protected int numsillin = 1;
	// el numero actual del pinon y plato activos

	protected int pinonact = 0;
	protected int platoact = 0;

	// los dientes que tiene cada plato y pinon
	protected int dientesplato[];
	protected int dientespinon[];

	// Cada pedalada, la rueda de traccion, arrastrada por el pinon, recorrera
	// un espacio que
	// dependera
	// de la relacion plato / pinon
	protected double relaciontransmision;

	// y del radio de la rueda
	protected double radiorueda;

	// EspacioporcadaPedalada = RecorridoLinealDelaRueda * RelaciondeTransmisin
	private double espacioporpedalada;

	public Bicicleta(int numeropinones, int numeroplatos, double radiorueda) {

		super();
		dientesplato = new int[numeroplatos];
		dientespinon = new int[numeropinones];
		numruedas = 2;

		dientesplato[pinonact] = 2;
		dientespinon[platoact] = 5;

		relaciontransmision = dientespinon[pinonact] / dientesplato[platoact];
		setEspacioporpedalada((Math.PI * radiorueda) * relaciontransmision);
	}

	/**
	 * devuelve el numero de pedales
	 * 
	 * @return numpedales
	 */
	public int getPedales() {
		return numpedales;
	}

	/**
	 * devuelve el peso
	 * 
	 * @return
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * devuelve el pinon activo
	 * 
	 * @return
	 */
	public int getPinon() {
		return pinonact;
	}

	/**
	 * devuelve el plato activo
	 * 
	 * @return
	 */
	public int getPlato() {
		return pinonact;
	}

	/**
	 * asigna el numero de dientes correspondiente al pinon o plato,
	 * 
	 * @param numerodientes
	 *            es el array que contiene el numero de dientes por pinon o
	 *            plato que queremos asignar
	 * 
	 * @param array
	 *            sirve para introducir o bien el array de platos o el array de
	 *            pinones al cual se le va a asignar el numero de dientes
	 */
	public void setAsignaNumeroDientes(int[] numerodientes, int array[]) {
		int i = 0;
		boolean compruebadientes = true;
		if (numerodientes.length == array.length) {

			while (i < numerodientes.length && compruebadientes) {

				array[i] = numerodientes[i];
				if (numerodientes[i] <= numerodientes[i + 1]) {
					compruebadientes = false;
				}
				i++;
			}
			if (!compruebadientes) {
				System.out
						.println("Los dientes no se asignaron correctamente porque el "
								+ "disco siguiente tenia mas dientes que el anterior");
			}
		} else {
			System.out
					.print("no se pueden asignar dientes porque los array no tienen la "
							+ "misma longitud");
		}
	}

	/**
	 * sirve para asignar el numero de pedales
	 * 
	 * @param numero
	 */
	public void setPedales(int numero) {
		numpedales = numero;
	}

	/**
	 * este metodo asigna un peso
	 * 
	 */
	public void setPeso(float pesos) {
		peso = pesos;
	}

	/**
	 * sirve para aumentar o disminuir el pinon que se quiere usar
	 * 
	 * @param accion
	 *            'a' = aumentar , 'd' = disminuir
	 */
	public void setPinon(char accion) {
		// aumentamos el pinon
		if (accion == 'a') {
			if (pinonact < dientespinon.length) {
				pinonact++;
			}
		}
		// disminuimos el pinon
		if (accion == 'd') {
			if (pinonact > 0) {
				pinonact--;
			}
		}
	}

	/**
	 * sirve para aumentar o disminuir el plato que se quiere usar
	 * 
	 * @param accion
	 *            'a' = aumentar , 'd' = disminuir
	 */
	public void setPlato(char accion) {
		// aumentamos el pinon
		if (accion == 'a') {
			if (platoact < dientesplato.length) {
				platoact++;
			}
		}
		// disminuimos el pinon
		if (accion == 'd') {
			if (platoact > 1) {
				platoact--;
			}
		}
	}

	@Override
	public void ejecuta() {
		

	
	}

	/**
	 * @return the espacioporpedalada
	 */
	public double getEspacioporpedalada() {
		return espacioporpedalada;
	}

	/**
	 * @param espacioporpedalada
	 *            the espacioporpedalada to set
	 */
	public void setEspacioporpedalada(double espacioporpedalada) {
		this.espacioporpedalada = espacioporpedalada;
	}

	public int getNumpedales() {
		return numpedales;
	}

	public void setNumpedales(int numpedales) {
		this.numpedales = numpedales;
	}

	public int getNumsillin() {
		return numsillin;
	}

	public void setNumsillin(int numsillin) {
		this.numsillin = numsillin;
	}

	public int getPinonact() {
		return pinonact;
	}

	public void setPinonact(int pinonact) {
		this.pinonact = pinonact;
	}

	public int getPlatoact() {
		return platoact;
	}

	public void setPlatoact(int platoact) {
		this.platoact = platoact;
	}

	public int[] getDientesplato() {
		return dientesplato;
	}

	public void setDientesplato(int[] dientesplato) {
		this.dientesplato = dientesplato;
	}

	public int[] getDientespinon() {
		return dientespinon;
	}

	public void setDientespinon(int[] dientespinon) {
		this.dientespinon = dientespinon;
	}

	public double getRelaciontransmision() {
		return relaciontransmision;
	}

	public void setRelaciontransmision(double relaciontransmision) {
		this.relaciontransmision = relaciontransmision;
	}

	public double getRadiorueda() {
		return radiorueda;
	}

	public void setRadiorueda(double radiorueda) {
		this.radiorueda = radiorueda;
	}

}
