package salidaDeDatos;

import persona.Ciclista;
import tiempo.Reloj;
import interfaceMain.InterfaceSalida;
import bicicleta.Bicicleta;
/**
 * 
 * @author Juan Carlos Marco y Juan Luis Pérez
 *
 */
public class SalidaDeDatos 
{

	
	public void mostrarPorPantalla(String mensaje,String formato)
	{
		String mensaje_final="";
		switch(formato)
		{
		case "velocidad": mensaje_final="Velocidad actual:" + mensaje + " m/s ";
		break;
		case "reloj": mensaje_final="Hora actual : " + mensaje;
		break;
		}
		System.out.println(mensaje_final);
	}

	
	
	
	/*@Override
	public void muestra(Object obj) {
		// TODO Auto-generated method stub
		
		if( obj instanceof Bicicleta)
		{
			//muestraBicicleta((Bicicleta)obj);
		}
		if( obj instanceof Reloj)
		{
			((Reloj) obj).mostrarReloj();
		}
		if( obj instanceof Ciclista)
		{
			//muestraCiclista((Ciclista)obj);
			System.out.println(((Ciclista) obj).getBici().getVelocidad());
		}
		
	}*/
	/*
	public void muestraBicicleta(Bicicleta bici)
	{
				
	}
	*/
/* metodo movido a reloj
	public void muestraReloj(Reloj rel)
	{
		int tiempo[] = new int[3];
		tiempo = rel.devuelveTiempo();
		System.out.println("hora " + tiempo[2] + " minuto " + tiempo[1]
				+ " segundo " + tiempo[0]);
	}
	*/
	/*
	public void muestraCiclista(Ciclista Cicli)
	{
		System.out.println(Cicli.getBici().getVelocidad());
	}
*/
	
	
}
