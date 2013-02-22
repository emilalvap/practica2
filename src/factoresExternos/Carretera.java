package factoresExternos;

import entradaDeDatos.*;

/**
 * esta clase crea una carretera a partir de un fichero
 * 
 * @author juancly
 * 
 */
public class Carretera {

    GeneraMatrizDeStringTokenizer fichero;
    String ruta;
    int matriz[];

    /**
     * recibe la direccion de la ruta en la que se encuentra el fichero de
     * carretera
     * 
     * @param miruta
     */

    public Carretera(String miruta) 
    {
	ruta = miruta;
	fichero = new GeneraMatrizDeStringTokenizer();
	matriz = fichero.convertirAArrayFichero(ruta);
    }

    /**
     * la matriz resultante es del tipo entero y su composicion es la siguiente
     * matriz[0] = metro en el que cambia la pendiente matriz[1] =pendiente que
     * ira desde 90 hasta -90
     */
    public int[] getMatriz() 
    {

	return matriz;
    }
}

