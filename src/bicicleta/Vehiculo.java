package bicicleta;

public class Vehiculo 
{
	protected float velocidad;
	protected int numruedas;
	protected int direccion;
	
	/**
	 * este metodo asigna una velocidad a la variable de clase velocidad
	 * @param v
	 */
	public void setDireccion(int d)
	{
		direccion = d;
	}
	public float getDireccion()
	{
		return direccion;
	}
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
