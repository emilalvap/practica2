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
		
		StringBuffer mensajefinal = new StringBuffer();
		
		switch(formato)
		{
			case "velocidad": 
			{
				mensajefinal.append("Velocidad actual:" + mensaje + " m/s ");
				break;
			}
			
			case "hh:mm:ss": 
			{
				int i = 0;
				while(i<mensaje.length())
				{
					if(mensaje.charAt(i) == ' ')
					{
						mensajefinal.insert(i,":");
					
					}
					else
					{
						mensajefinal.insert(i,mensaje.charAt(i));
					}
				
					i++;
				}	
			
				break;
			}
		}
		System.out.println(mensajefinal.toString());
	}
	
}
