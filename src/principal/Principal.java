package principal;





import interfaceMain.InterfaceMain;

import java.util.ArrayList;


import bicicleta.Bicicleta;

import tiempo.*;

public class Principal 
{
	
	public static void main(String args[])
	{
	
		
		ArrayList<InterfaceMain> lista=new ArrayList<InterfaceMain>();
		
		Bicicleta bici1= new Bicicleta(1, 1, 1);
		Reloj reloj= new Reloj();
		
		lista.add(bici1);
		lista.add(reloj);
		
		for (InterfaceMain c: lista)
		{
			c.ejecuta();
		}
		
		
		//Milisegundo mil = new Milisegundo();
		//System.out.print(mil.cuentaMilisegundos());
		     
	}
}
