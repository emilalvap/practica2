package principal;

import interfaceMain.InterfaceMain;

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

		InterfaceMain bici1 = new Bicicleta(5, 2, 1);
		InterfaceMain reloj = new Reloj();
		InterfaceMain ciclista = new Ciclista((Bicicleta) bici1);

		lista.add(bici1);
		lista.add(reloj);
		lista.add(ciclista);

	}

	public void ejecuta() {

		while (true) {
			for (Object c : lista) {
				((InterfaceMain) c).ejecuta();
			}
		}
	}

	public void finaliza() {

	}

}
