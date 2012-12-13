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
public class Principal {

	private ArrayList<Object> listaejecuta;
	private ArrayList<Object> listasalida;

	public static void main(String args[]) {

		Principal p = new Principal();
		p.inicia();
		p.ejecuta();
		p.finaliza();

	}

	public void inicia() {
		listaejecuta = new ArrayList<Object>();
		listasalida = new ArrayList<Object>();

		InterfaceEjecuta bici1 = new Bicicleta(5, 2, 1);
		InterfaceEjecuta reloj = new Reloj();
		InterfaceEjecuta ciclista = new Ciclista((Bicicleta) bici1);

		listaejecuta.add(bici1);
		listaejecuta.add(reloj);
		listaejecuta.add(ciclista);

		//listasalida.add(bici1);
		//listasalida.add(reloj);
		listasalida.add(ciclista);

	}

	public void ejecuta() {

		SalidaDeDatos salida = new SalidaDeDatos();

		while (true) {
			for (Object c : listaejecuta) {
				((InterfaceEjecuta) c).ejecuta();
			}
			for (Object c : listasalida) {

				((InterfaceSalida) c).muestra();
			}

		}
	}

	public void finaliza() {

	}

}
