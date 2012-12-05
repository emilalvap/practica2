package bicicleta;

public class Bicicleta 
{
	//numero de piñones y platos que tiene la bicicleta
	protected int numpinon ;
	protected int numplato ;
	
	//el numero actual del piñon y plato
	protected int pinonact = 1;
	protected int platoact = 1;
	
	//los radios que tiene cada plato y piñon
	protected float radioplato [];
	protected float radiopiñon [];
	
	//este metodo cambia el piñon, donde piñonact , es el piñon actual usado, accion 
	// es si queremos aumentar o disminuir este y numpiñon es el piñon maximo
	public void setPinon(char accion)
	{
		//aumentamos el piñon
		if (accion == 'a')
		{
			if ( pinonact < numpinon)
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
	public int getPinon()
	{
		return pinonact;
	}
	
	public void setPlato(char accion)
	{
		//aumentamos el piñon
		if (accion == 'a')
		{
			if ( platoact < numplato)
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
	public int getPlato()
	{
		return pinonact;
	}	
}
