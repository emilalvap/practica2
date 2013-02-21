package entradaDeDatos;

import java.util.StringTokenizer;

/**
 * esta clase es capaz de devolver los datos de un fichero, en un array de enteros.
 * @author juancly
 *
 */
public class GeneraMatrizDeStringTokenizer 
{
   
    Entrada entrada;
    /**
     * dado un fichero, este se convierte a tokens, y estos son devueltos en un array de enteros
     * @param fichero
     * @return
     */
    public int[] convertirAArrayFichero(String fichero)
    {
	entrada = new Entrada();
	
	return devuelveMatrizDeStringTokenizer(entrada.cargarFicheroEnStringTokenizer(fichero));
	
    }
    /**devuelve un array de enteros dado un texto con tokens
     * 
     * @param textoConTokens
     * @return
     */
    private int[] devuelveMatrizDeStringTokenizer(StringTokenizer textoConTokens)
    {
	int [] array = new int[textoConTokens.countTokens()];
	int i = 0;
	while(textoConTokens.hasMoreElements())
	{
	    array[i] = Integer.parseInt(textoConTokens.nextToken());
	    i++;
	    
	}
	return array;
    }
}
