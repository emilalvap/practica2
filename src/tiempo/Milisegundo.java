package tiempo;

public class Milisegundo 
{
	private long milisegundosactuales;
	private long milisegundos;
    
	/**
	 * este metodo cuenta milisegundos y devuelve 1 cuando se cuenta un segundo
	 * @return
	 */
    public int devuelveSegundo()
    {
    	milisegundosactuales = System.currentTimeMillis();//Variable para obtener el tiempo al abrir el programa
        int segundo = 0;
    	while(segundo < 2)
    	{
    		milisegundos = System.currentTimeMillis();//Método para obtener el tiempo actual
    		if (milisegundosactuales == milisegundos)
    		{   
    			milisegundosactuales = milisegundos + 1000;//1000 milisegundos = 1 segundo
          
    			//System.out.println(segundo);
    			segundo ++;
    		}
    		else if((milisegundosactuales + 1000) < milisegundos)//Metodo para evitar que se detenga el contador
    			milisegundosactuales = System.currentTimeMillis();
    	}   
		return 1;
	

    }
}
