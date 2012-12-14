package salidaDeDatos;

/**Esta clase sera la encargada de mostrar la informacion al usuario
 * 
 * @author Juan Carlos Marco y Juan Luis Pérez
 *
 */
public class SalidaDeDatos 
{

	/**
	 * este metodo saca por pantalla el mensaje introducido con el formato indicado, el cual debe de existir
	 * en el propio metodo
	 * @param mensaje  La informacion a mostrar
	 * @param formato  El formato para mostrar la informacion
	 */
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
