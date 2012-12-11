package persona;

import bicicleta.*;

public class Ciclista extends Persona {
	private float cadencia; // numero de pedaladas por segundo
	private Bicicleta bici;

	/*
	 * formulas espacio = Vinicial * tiempo + (1/2)*a*(t al cuadrado) Vfinal = V
	 * inicial + a * t cadencia = (pedaleo/minuto) * (plato/piÃ±on) = 2 * pi * R
	 */

	// envia una cadencia de pedaleo a la bicicleta que esta transformara a
	// movimiento

	public Ciclista(Bicicleta nueva_bici) {
		setBici(nueva_bici);
		cadencia = 1;

	}

	public void pedalear() {

		float aceleracion;
		float velocidad_final;
		float espacio;

		aceleracion = getBici().calcularAceleracion(getBici().getVelocidad(),
				(float) (getBici().getEspacioporpedalada() / cadencia), 1);
		velocidad_final = getBici().calcularVelocidadFinal(getBici().getVelocidad(),
				aceleracion, 1);
		espacio = getBici().calcularEspacioRecorrido(getBici().getVelocidad(), 1,
				aceleracion);

		getBici().acelerar(velocidad_final);

	}

	// asigna un rumbo que se enviara a la bicicleta
	public void setRumbo(int d, Bicicleta bici) {
		bici.setDireccion(d);
	}

	@Override
	public void ejecuta() {

		pedalear();
		

	}

	/**
	 * @return the bici
	 */
	public Bicicleta getBici() {
		return bici;
	}

	/**
	 * @param bici the bici to set
	 */
	public void setBici(Bicicleta bici) {
		this.bici = bici;
	}

}
