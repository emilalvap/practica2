package principal;

import interfaceMain.InterfaceEjecuta;
import interfaceMain.InterfaceSalida;

import java.util.ArrayList;

import persona.Ciclista;
import salidaDeDatos.SalidaDeDatos;
import tiempo.Reloj;
import bicicleta.Bicicleta;
/**
 * Clase Principal del programa
 * @author Juan Carlos Marco y Juan Luis Pérez
 *
 */
public class  Principal 
{

	private ArrayList<Object> listaejecuta;
	private ArrayList<Object> listasalida;

	//SalidaDeDatos salida;

	public static void main(String args[]) 
	{

		Principal p = new Principal();
		p.inicia();
		p.ejecuta();
		p.finaliza();

	}

	public void inicia() 
	{
		listaejecuta = new ArrayList<Object>();
		listasalida = new ArrayList<Object>();


		int dientesporpinon[] = {17,16,15,14,13,12};
		int dientesporplato[] = {36,40,44};
		InterfaceEjecuta bici1 = new Bicicleta(dientesporpinon.length, dientesporplato.length, 
				1,dientesporpinon,dientesporplato,0.6858);
		InterfaceEjecuta reloj = new Reloj();
		InterfaceEjecuta ciclista = new Ciclista((Bicicleta) bici1);

				
		listaejecuta.add(ciclista);
		listaejecuta.add(reloj);
		listaejecuta.add(bici1);

		listasalida.add(reloj);
		listasalida.add(bici1);
		listasalida.add(ciclista);

	}

	public void ejecuta() 
	{
		int contador=0; // Contara los segundos de ejecucion del programa
		int limite=60;  // Se establecera el limite en SEGUNDOS de la ejecucion del programa
		//salida = new SalidaDeDatos(listasalida);

		
		while (contador < limite) 
		{
			
			for (Object c : listaejecuta) 
			{
				((InterfaceEjecuta) c).ejecuta();
			}

			for (Object c : listasalida) 
			{
				((InterfaceSalida) c).muestra();
			}

			contador++; 
			

		}
	}

	public void finaliza() 
	{

	}

}
