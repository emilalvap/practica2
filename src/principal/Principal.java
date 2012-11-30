package principal;



import tiempo.*;

public class Principal 
{
	
	public static void main(String args[])
	{
		Reloj r = new Reloj();
		
		while(true)
		{
			r.cuentaReloj();
			r.mostrarReloj();
			
		}
		
		//Milisegundo mil = new Milisegundo();
		//System.out.print(mil.cuentaMilisegundos());
		     
	}
}
