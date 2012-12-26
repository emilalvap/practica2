package persona;


import interfaceMain.InterfaceEjecuta;
import interfaceMain.InterfaceSalida;
import bicicleta.*;


/**
 * Esta clase representa una especializacion de persona , ciclista , es decir , persona que conduce una bicicleta y conoce su interfaz
 * @author Juan Carlos Marco y Juan Luis Pérez
 *
 */
public class Ciclista extends Persona implements InterfaceEjecuta,InterfaceSalida 
{
	private float cadencia; // numero de pedaladas por segundo
	private Bicicleta bici;

	
	public Ciclista(Bicicleta nueva_bici) 
	{
		
		setBici(nueva_bici);
		cadencia = 2;

	}
/**
 * Acción básica del ciclista. Mandará un mensaje a su bicicleta con las pedaladas por segundo.
 * Si ha alcanzado la velocidad máxima ( relacionada con la relaciones de piñones y demás especificaciones de la bicicleta )
 * el pedaleo no tendrá efecto
 * 
 */
	public void pedalear(float micadencia) 
	{

		getBici().setCadencia(micadencia);
		
	}

	// asigna un rumbo que se enviara a la bicicleta
	public void setRumbo(int d, Bicicleta bici) 
	{
		bici.setDireccion(d);
	}

	/**
	 * este metodo envia la accion a la bicicleta de cambiar piñon, 
	 * @param accion si es una 'a' aumentara piñon, si es 'd' disminuira piñon
	 */
	public void cambiarPinon(char accion)
	{
		
		if(accion=='a')
		{
			bici.setPinon('a');
		}
		if(accion == 'd')
		{
			bici.setPinon('d');
		}
	}
	/**
	 * este metodo envia la accion a la bicicleta de cambiar plato, 
	 * @param accion si es una 'a' aumentara plato, si es 'd' disminuira plato
	 */
	public void cambiarPlato(char accion)
	{
		
		if(accion=='a')
		{
			bici.setPlato('a');
		}
		if(accion == 'd')
		{
			bici.setPlato('d');
		}
	}
	/**
	 * este metodo esta heredado de la clase InterfazEjecuta, y todo lo que haya en el, se ejecutara 
	 * cuando se realice el for each de la lista correspondiente
	 */
	public void ejecuta() 
	{
		bici.setCadencia(cadencia);
		pedalear(cadencia);
		//cambiarPlato('d');
	    cambiarPinon('a');

	}

	/**devuelve la bicicleta usada por el ciclista
	 * @return the bici
	 */
	public Bicicleta getBici() 
	{
		return bici;
	}

	/** asigna bicicleta al ciclista
	 * @param bici the bici to set
	 */
	public void setBici(Bicicleta mibici) 
	{
		this.bici = mibici;
	}
	/**
	 * este metodo esta heredado de la clase InterfazSalida, y todo lo que haya en el, se mostrara 
	 * cuando se realice el for each de la lista correspondiente
	 */
	public void muestra() 
	{
		
		
				
		
	}

}
