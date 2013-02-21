package entradaDeDatos;

import interfaceMain.InterfaceEjecuta;

import java.io.*;

import comandos.Parser;

public class Entrada {

    InputStreamReader lectura;

    public Entrada(InputStreamReader nuevo_origen_de_lectura) {
	lectura = nuevo_origen_de_lectura;
    }

 
    public String leer() {
	String Salida="NINGUNA";
	// TODO Auto-generated method stub
	try {

	    if (lectura.ready()) {
		char[] buffer_de_lectura = new char[100];
		lectura.read(buffer_de_lectura);

		Salida = new String(buffer_de_lectura);
		// System.out.println(Salida);
		
	    }
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} finally {
	    
	}
	return Salida;
    }

}
