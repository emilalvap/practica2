package bicicleta;

public class Bicicleta extends Vehiculo
{
	
	//almacena el numero de pedales, ya que puede haber tandems
	protected int numpedales = 2;
	
	protected int numsillin = 1;
	//el numero actual del piñon y plato activos
	
	protected int pinonact = 1;
	protected int platoact = 1;
	
	//los dientes que tiene cada plato y piñon
	protected int dientesplato [];
	protected int dientespinon [];
	

	//este metodo cambia el piñon, donde piñonact , efloats el piñon actual usado, accion 
	// es si queremos aumentar o disminuir este y numpiñon es el piñon maximo
	
	public void Bicicleta(int numeropinones, int numeroplatos)
	{
	
		dientesplato  = new int[numeroplatos];
		dientespinon  = new int[numeropinones];
		numruedas = 2;
	}
	
	
	
	
	
	public int getPedales ()
	{
		return numpedales ;
	}
	
	public int getPinon()
	{
		return pinonact;
	}
	
	public int getPlato()
	{
		return pinonact;
	}
	
	/**
	 * asigna el numero de dientes correspondiente al piñon o plato,
	 * 
	 * @param numerodientes es el array que contiene el numero de dientes por piñon o plato que 
	 * queremos asignar
	 * 
	 * @param array sirve para introducir o bien el array de platos o el array de piñones al
	 *  cual se le va a asignar el numero de dientes
	 */
	public void setAsignaNumeroDientes(int [] numerodientes, int array[])
	{
		int i = 0;
		boolean compruebadientes = true;
		if (numerodientes.length == array.length)
		{	
			
			while(i< numerodientes.length && compruebadientes)
			{
			
				array[i] = numerodientes[i];
				if( numerodientes[i]<= numerodientes[i+1] )
				{
					compruebadientes = false;
				}
				i++;
			}
			if ( !compruebadientes)
			{
				System.out.println("Los dientes no se asignaron correctamente porque el "+
						"disco siguiente tenia mas dientes que el anterior");
			}
		}
		else
		{
			System.out.print("no se pueden asignar dientes porque los array no tienen la " +
					"misma longitud");
		}
	}
	
	public void setPedales (int numero)
	{
		numpedales = numero;
	}
	
	public void setPinon(char accion)
	{
		//aumentamos el piñon
		if (accion == 'a')
		{
			if ( pinonact < dientespinon.length)
			{
				pinonact++;
			}
		}
		//disminuimos el piñon
		if (accion == 'd')
		{
			if ( pinonact > 1)
			{
				pinonact--;
			}
		}
	}
	
	public void setPlato(char accion)
	{
		//aumentamos el piñon
		if (accion == 'a')
		{
			if ( platoact < dientesplato.length)
			{
				platoact++;
			}
		}
		//disminuimos el piñon
		if (accion == 'd')
		{
			if ( platoact > 1)
			{
				platoact--;
			}
		}
	}
	
		
}
