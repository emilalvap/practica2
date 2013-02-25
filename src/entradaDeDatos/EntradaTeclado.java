package entradaDeDatos;

import interfaceMain.InterfaceEjecuta;

import java.io.*;


import comandos.Parser;

public class EntradaTeclado implements InterfaceEjecuta {

    BufferedReader lectura;

    public EntradaTeclado() {

    }

    public EntradaTeclado(BufferedReader nuevo_origen_de_lectura) {
	lectura = nuevo_origen_de_lectura;
    }
/**
 * Mediante un BufferReader cualquiera , lee (si están disponibles // no realiza espera activa )  una cadena y la devuelve.
 * @return Salida La cadena leída o NINGUNA si no ha leido nada.
 */
    public String leer() {
	String Salida = "NINGUNA";
	
	try {

	    if (lectura.ready()) {
		char[] buffer_de_lectura = new char[100];
		lectura.read(buffer_de_lectura);

		Salida = new String(buffer_de_lectura);
		

	    }
	} catch (IOException e) {
	    
	    e.printStackTrace();
	} finally {

	}
	return Salida;
    }

   
    @Override
    public void ejecuta() {
	leer();
	// TODO Auto-generated method stub

    }

}
