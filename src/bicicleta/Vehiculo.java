package bicicleta;

public class Vehiculo 
{
	protected float velocidad;
	protected int numruedas;
	
	/**
	 * este metodo asigna una velocidad a la variable de clase velocidad
	 * @param v
	 */
	public void setVelocidad(float v)
	{
		velocidad = v;
	}
	public float getVelocidad()
	{
		return velocidad;
	}
	public void frenar ( float decremento)
	{
		velocidad = velocidad - decremento;
	}
	public void acelerar (float aumento)
	{
		velocidad = velocidad + aumento;
	}
}
