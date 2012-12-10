package principal;





import interfaceMain.InterfaceMain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bicicleta.Bicicleta;

import tiempo.*;

public class Principal 
{
	
	public static void main(String args[])
	{
	
		
		ArrayList<InterfaceMain> a=new ArrayList<InterfaceMain>();
		
		Bicicleta b= new Bicicleta(1, 1, 1);
		
		a.add(b);
		
		for (InterfaceMain c: a)
		{
			c.ejecuta();
		}
		
		
		//Milisegundo mil = new Milisegundo();
		//System.out.print(mil.cuentaMilisegundos());
		     
	}
}
