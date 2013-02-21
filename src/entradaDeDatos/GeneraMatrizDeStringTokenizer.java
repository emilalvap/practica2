package entradaDeDatos;

import java.util.StringTokenizer;

public class GeneraMatrizDeStringTokenizer 
{
    Entrada entrada;
    public int[] convertirAArrayFichero(String fichero)
    {
	entrada = new Entrada();
	
	return devuelveMatrizDeStringTokenizer(entrada.cargarFicheroEnStringTokenizer(fichero));
	
    }
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
