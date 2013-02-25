package factoresExternos;

import entradaDeDatos.*;

/**
 * esta clase crea una carretera a partir de un fichero
 * 
 * @author juancly
 * 
 */
public class Carretera {

    EntradaFichero fichero;
    String ruta;
    double[] matriz;

    /**
     * recibe la direccion de la ruta en la que se encuentra el fichero de
     * carretera
     * 
     * @param miruta
     */

    public Carretera(String miruta) 
    {
	ruta = miruta;
	fichero = new EntradaFichero();
	matriz = fichero.convertirAArrayFichero(ruta,":;");
    }

    /**
     * la matriz resultante es del tipo entero y su composicion es la siguiente
     * matriz[0] = metro en el que cambia la pendiente matriz[1] =pendiente que
     * ira desde 90 hasta -90
     */
    public double[] getMatriz() 
    {

	return matriz;
    }
}

