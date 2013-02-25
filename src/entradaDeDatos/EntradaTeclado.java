package entradaDeDatos;

import interfaceMain.InterfaceEjecuta;

import java.io.*;
import java.util.StringTokenizer;

import comandos.Parser;

public class EntradaTeclado implements InterfaceEjecuta
{

    InputStreamReader lectura;

    public EntradaTeclado() 
    {
	
    }
    public EntradaTeclado(InputStreamReader nuevo_origen_de_lectura) 
    {
	lectura = nuevo_origen_de_lectura;
    }

    public String leer() 
    {
	String Salida = "NINGUNA";
	// TODO Auto-generated method stub
	try 
	{

	    if (lectura.ready()) 
	    {
		char[] buffer_de_lectura = new char[100];
		lectura.read(buffer_de_lectura);

		Salida = new String(buffer_de_lectura);
		//System.out.println(Salida);

	    }
	} 
	catch (IOException e) 
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} 
	finally 
	{

	}
	return Salida;
    }
    /**
     * devuelve un StringTokenizer con los datos del fichero dado.
     * @param fichero
     * @return
     */
    
    @Override
    public void ejecuta() 
    {
	leer();
	// TODO Auto-generated method stub
	
    }

}
