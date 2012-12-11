package principal;



import interfaceMain.InterfaceEjecuta;

import java.util.ArrayList;

import persona.Ciclista;

import bicicleta.Bicicleta;

import tiempo.*;

public class Principal {

	private ArrayList<Object> lista;

	public static void main(String args[]) {

		Principal p = new Principal();
		p.inicia();
		p.ejecuta();
		p.finaliza();

	}

	public void inicia() {
		lista = new ArrayList<Object>();

		InterfaceEjecuta bici1 = new Bicicleta(5, 2, 1);
		InterfaceEjecuta reloj = new Reloj();
		InterfaceEjecuta ciclista = new Ciclista((Bicicleta) bici1);

		lista.add(bici1);
		lista.add(reloj);
		lista.add(ciclista);

	}

	public void ejecuta() {

		while (true) {
			for (Object c : lista) {
				((InterfaceEjecuta) c).ejecuta();
			}
		}
	}

	public void finaliza() {

	}

}
