package entradaDeDatos;

import interfaceMain.InterfaceEjecuta;

import java.io.*;
import java.util.StringTokenizer;

import comandos.Parser;

public class Entrada 
{

    InputStreamReader lectura;

    public Entrada() 
    {
	
    }
    public Entrada(InputStreamReader nuevo_origen_de_lectura) 
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
		// System.out.println(Salida);

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
    public StringTokenizer cargarFicheroEnStringTokenizer(String fichero) 
    {
	
	String contenidoficherocontokens = new String();

	if (fichero != null) 
	{
		BufferedReader bufferdelectura;
		try 
		{
			bufferdelectura = new BufferedReader(new FileReader(fichero));
			while (bufferdelectura.ready())
			{
			    
				contenidoficherocontokens += bufferdelectura.readLine() ;
			}
		} 
		catch (FileNotFoundException e) 
		{
			System.err.println(e + "\nArchivo no encontrado."
					+ "Escriba el nuevo nombre de archivo y por área.");

		} 
		catch (IOException e) 
		{
			System.err.println(e
					+ "\nError de hardware durante la lectura."
					+ "Introduzca el nuevo nombre de archivo y por área.");
		}
	}

	return new StringTokenizer(contenidoficherocontokens, ":;");
    }

}
