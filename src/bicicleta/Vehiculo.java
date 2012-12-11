package bicicleta;

import interfaceMain.InterfaceEjecuta;


public class Vehiculo implements InterfaceEjecuta {
	protected float velocidad;
	protected int numruedas;

	protected int direccion = 0;
	protected float peso = 0;

	public Vehiculo() {
		velocidad = 0;
	}

	/**
	 * asigna el rumbo a seguir , el cual sera desde 0 a 359
	 * 
	 * @param d
	 */

	public void setDireccion(int d) {
		if (direccion >= 0 && direccion < 360) {
			direccion = d;
		}
	}

	/**
	 * devuelve el rumbo
	 * 
	 * @return
	 */
	public float getDireccion() {
		return direccion;
	}

	/**
	 * este metodo asigna una velocidad a la variable de clase velocidad
	 * 
	 * @param v
	 */
	public void setVelocidad(float v) {
		velocidad = v;
	}

	/**
	 * devuelve la velocidad actual
	 * 
	 * @return
	 */
	public float getVelocidad() {
		return velocidad;
	}

	/**
	 * este metodo decrementa a la velocidad actual el decremento
	 * 
	 * @param decremento
	 */
	public void frenar(float decremento) {
		velocidad = velocidad - decremento;
	}

	/**
	 * este metodo suma a la velocidad el aumento
	 * 
	 * @param aumento
	 */
	public void acelerar(float aumento) {
		velocidad = velocidad + aumento;
	}

	public float calcularAceleracion(float vinicial, float vfinal, int tiempo) {
		float aceleracion = 0;

		aceleracion = (vfinal - vinicial) / tiempo;
		return aceleracion;
	}

	public float calcularVelocidadFinal(float vinicial, float aceleracion,int tiempo) {
		float vfinal = 0;

		vfinal = vinicial + aceleracion * tiempo;
		return vfinal;
	}

	public float calcularEspacioRecorrido(float vinicial, int tiempo,
			float aceleracion) {

		float espacio = 0;
		espacio = vinicial * tiempo + (1 / 2) * aceleracion * (tiempo * tiempo);
		return espacio;
	}

	@Override
	public void ejecuta() {
		// TODO Auto-generated method stub

		System.out.println("test1");
	}

}
