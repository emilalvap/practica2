package salidaDeDatos;

/**
 * 
 * @author Juan Carlos Marco y Juan Luis Pérez
 *
 */
public class SalidaDeDatos 
{

	
	public void mostrarPorPantalla(String mensaje,String formato)
	{
		String mensaje_final="";
		switch(formato)
		{
		case "velocidad": mensaje_final="Velocidad actual:" + mensaje + " m/s ";
		break;
		case "hh:mm:ss": 
			int i = 0;
			while(i<mensaje.length())
			{
				if(mensaje.charAt(i) == ' ')
				{
					mensaje_final = mensaje_final + ":";
				}
				else
				{
					mensaje_final = mensaje_final + mensaje.charAt(i);
				}
				i++;
			}
			
		break;
		}
		System.out.println(mensaje_final);
	}

	
	
	
	
}
