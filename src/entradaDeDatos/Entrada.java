package entradaDeDatos;

import interfaceMain.InterfaceEjecuta;

import java.io.*;

public class Entrada implements InterfaceEjecuta {

    InputStreamReader lectura;

    public Entrada(InputStreamReader nuevo_origen_de_lectura) {
	lectura = nuevo_origen_de_lectura;
    }

    @Override
    public void ejecuta() {
	// TODO Auto-generated method stub
	try {

	    if (lectura.ready()) {
		char[] buffer_de_lectura = new char[100];
		lectura.read(buffer_de_lectura);

		String Salida = new String(buffer_de_lectura);
		// System.out.println(Salida);

	    }
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} finally {

	}
    }

}
