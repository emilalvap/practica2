package bicicleta;

import salidaDeDatos.SalidaDeDatos;
import interfaceMain.InterfaceEjecuta;
import interfaceMain.InterfaceSalida;
/**
 * 
 * Bicicleta estándar . Hereda de Vehiculo
 * @author Juan Carlos Marco y Juan Luis Perez
 */
public class Bicicleta extends Vehiculo  implements InterfaceEjecuta, InterfaceSalida{

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

	public Bicicleta(int numeropinones, int numeroplatos, double radiorueda,int midientepinon[], int midienteplato[]) {

		super();
		int i = 0;
		
		dientesplato = new int[numeroplatos];
		dientespinon = new int[numeropinones];
		numruedas = 2;

		
		
		dientesplato[platoact] = 5;

		//asignamos el numero de dientes a cada piñon y a cada plato
		
		setAsignaNumeroDientesPinon( midientepinon);
		
		setAsignaNumeroDientesPlato( midienteplato);
		
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
	 *            sirve para introducir el array de
	 *            pinones al cual se le va a asignar el numero de dientes
	 */
	public void setAsignaNumeroDientesPinon( int numerodientes[]) {
		int i = 0;
		boolean compruebadientes = true;
		if (dientespinon.length == numerodientes.length) 
		{

			i = 1;
			while (i < dientespinon.length  && compruebadientes) 
			{

				if (numerodientes[i-1] <= numerodientes[i]) 
				{
				
					compruebadientes = false;
				}
				i++;
			}
			i = 0;
			
			if (!compruebadientes) 
			{
				System.out
						.println("Los dientes no se asignaron correctamente porque el "
								+ "piñon siguiente tenia mas dientes que el anterior");
			}
			else
			{
				while (i < dientespinon.length  && compruebadientes) 
				{

					dientespinon[i] = numerodientes[i];		
					i++;
				}
			}
		} 
		else 
		{
			System.out
					.print("no se pueden asignar dientes porque los array de piñones no tienen la "
							+ "misma longitud");
		}
	}
	
	/**
	 * asigna a los platos de la bicicleta, el numero de dientes del array
	 * @param numerodientes trae el numero de dientes por plato
	 */
	public void setAsignaNumeroDientesPlato( int numerodientes[]) {
		int i = 0;
		boolean compruebadientes = true;
		if (dientesplato.length == numerodientes.length) 
		{

			i = 1;
			while (i < dientesplato.length  && compruebadientes) 
			{

				if (numerodientes[i-1] >= numerodientes[i]) 
				{
				
					compruebadientes = false;
				}
				i++;
			}
			i = 0;
			
			if (!compruebadientes) 
			{
				System.out
						.println("Los dientes no se asignaron correctamente porque el "
								+ "plato siguiente tenia menos dientes que el anterior");
			}
			else
			{
				while (i < dientesplato.length  && compruebadientes) 
				{

					dientesplato[i] = numerodientes[i];		
					i++;
				}
			}
		} 
		else 
		{
			System.out
					.print("no se pueden asignar dientes porque los array no tienen la "
							+ "misma longitud");
		}
	}
	/**
	 * Este metodo recibe una pedalada del ciclista . Realizará los cálculos pertinentes pertenciencientes al Movimiento
	 * Rectilineo Uniformente Acelerado ( MRUA ) y devolverá una modificacion de la velocidad de la bicicleta.
	 * @param cadencia pedaladas por segundo que manda el ciclista
	 */
	public void darPedalada(float cadencia)
	{
		float aceleracion;
		float velocidad_final;
		float espacio;

		aceleracion = calcularAceleracion(getVelocidad(),
				(float) (getEspacioporpedalada() / cadencia), 1);
		velocidad_final = calcularVelocidadFinal(getVelocidad(),
				aceleracion, 1);
		espacio = calcularEspacioRecorrido(getVelocidad(), 1,
				aceleracion);
		espaciorecorrido+=espacio;

		acelerar(velocidad_final);
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

	@Override
	public void muestra() {
		SalidaDeDatos output= new SalidaDeDatos();
		String mensaje;
		mensaje = String.valueOf(getVelocidad());
		output.mostrarPorPantalla(mensaje, "velocidad");
		
	}

}
