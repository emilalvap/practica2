package principal;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tiempo.*;

public class Principal 
{
	
	public static void main(String args[])
	{
		List<Object> o = new ArrayList<Object>();
		o.add("Bicicleta");

		for (Object singleObject: o)
			{
			 singleObject.ejecuta();
			}
		
	
		
		
		
		//Milisegundo mil = new Milisegundo();
		//System.out.print(mil.cuentaMilisegundos());
		     
	}
}
