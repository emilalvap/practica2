package entradaDeDatos;

import java.io.*;

public class SuperLectura {

    public SuperLectura() {

    }

    public BufferedReader CrearLectorPorTeclado() {

	return new BufferedReader(new InputStreamReader(
		new BufferedInputStream(new DataInputStream(System.in))));
    }

    public BufferedReader CrearLectorPorFichero(String Fichero) {
	BufferedReader Lector = null;
	try {
	    Lector = new BufferedReader(new InputStreamReader(
		    new BufferedInputStream(new FileInputStream(Fichero))));
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return Lector;
    }
}
