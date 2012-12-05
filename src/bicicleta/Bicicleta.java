package bicicleta;

public class Bicicleta 
{
	
	//pruebagit
	//el numero actual del piñon y plato activos
	
	protected int pinonact = 1;
	protected int platoact = 1;
	
	//los dientes que tiene cada plato y piñon
	protected int dientesplato [];
	protected int dientespinon [];
	
	//este metodo cambia el piñon, donde piñonact , es el piñon actual usado, accion 
	// es si queremos aumentar o disminuir este y numpiñon es el piñon maximo
	
	public void Bicicleta(int numeropinones, int numeroplatos)
	{
		
		dientesplato  = new int[numeroplatos];
		dientespinon  = new int[numeropinones];
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
	public int getPinon()
	{
		return pinonact;
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
	
	public int getPlato()
	{
		return pinonact;
	}	
}
