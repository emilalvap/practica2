package persona;

import interfaceMain.InterfaceEjecuta;
import bicicleta.*;


/**
 * Esta clase representa una especializacion de persona , ciclista , es decir , persona que conduce una bicicleta y conoce su interfaz
 * @author Juan
 *
 */
public class Ciclista extends Persona implements InterfaceEjecuta  {
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
/**
 * Acción básica del ciclista. Mandará un mensaje a su bicicleta con las pedaladas por segundo.
 * Si ha alcanzado la velocidad máxima ( relacionada con la relaciones de piñones y demás especificaciones de la bicicleta )
 * el pedaleo no tendrá efecto
 * 
 */
	public void pedalear() {

		
		getBici().darPedalada(cadencia);

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
