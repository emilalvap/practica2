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
		bici = nueva_bici;
		cadencia=1; 

	}

	public void pedalear() {
		
		float aceleracion;
		float velocidad_final;
		float espacio;
		
		aceleracion= bici.calcularAceleracion(bici.getVelocidad(), (float) (bici.getEspacioporpedalada()/cadencia), 1);
		velocidad_final=bici.calcularVelocidadFinal(bici.getVelocidad(), aceleracion, 1);
		espacio=bici.calcularEspacioRecorrido(bici.getVelocidad(), 1, aceleracion);
		
		
		
		bici.setVelocidad(velocidad_final);
				
	}

	// asigna un rumbo que se enviara a la bicicleta
	public void setRumbo(int d, Bicicleta bici) {
		bici.setDireccion(d);
	}

	@Override
	public void ejecuta() {
		
		pedalear();
		System.out.println(bici.getVelocidad());

	}

}
