package persona;


import interfaceMain.InterfaceEjecuta;
import interfaceMain.InterfaceSalida;
import bicicleta.*;


/**
 * Esta clase representa una especializacion de persona , ciclista , es decir , persona que conduce una bicicleta y conoce su interfaz
 * @author Juan Carlos Marco y Juan Luis Pérez
 *
 */
public class Ciclista extends Persona implements InterfaceEjecuta,InterfaceSalida {
	private float cadencia; // numero de pedaladas por segundo
	private Bicicleta bici;

	
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

		float velocidad_maxima;
		
		velocidad_maxima= (float) (bici.getEspacioporpedalada() / cadencia) ;
		if (bici.getVelocidad() < velocidad_maxima)
		{
			getBici().darPedalada(cadencia);
		}
		
	}

	// asigna un rumbo que se enviara a la bicicleta
	public void setRumbo(int d, Bicicleta bici) {
		bici.setDireccion(d);
	}

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
	
	public void muestra() {
		
		
				
		
	}

}
