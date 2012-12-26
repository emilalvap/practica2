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
public class Principal 
{

	private ArrayList<Object> listaejecuta;
	private ArrayList<Object> listasalida;

	SalidaDeDatos salida;
	
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
//(int numeropinones, int numeroplatos, double radiorueda,int midientepinon[], int midienteplato[]) {

		int dientesporpinon[] = {6,5,4,3,2,1};
		int dientesporplato[] = {2,3,4};
		InterfaceEjecuta bici1 = new Bicicleta(dientesporpinon.length, dientesporplato.length, 
								1,dientesporpinon,dientesporplato);
		InterfaceEjecuta reloj = new Reloj();
		InterfaceEjecuta ciclista = new Ciclista((Bicicleta) bici1);

		listaejecuta.add(reloj);
		listaejecuta.add(bici1);		
		listaejecuta.add(ciclista);

		listasalida.add(reloj);
		listasalida.add(bici1);
		listasalida.add(ciclista);

	}

	public void ejecuta() 
	{

		
		salida = new SalidaDeDatos(listasalida);
		while (true) 
		{
			for (Object c : listaejecuta) 
			{
				((InterfaceEjecuta) c).ejecuta();
				
				
			}
			for (Object c : listasalida) 
			{
				((InterfaceSalida) c).muestra();
				
				
			}

		}
	}

	public void finaliza() 
	{

	}

}
