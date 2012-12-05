package bicicleta;

public class Vehiculo 
{
	protected float velocidad;
	protected int numruedas;
	protected int direccion;
	
	
	public void setDireccion(int d)
	{
		direccion = d;
	}
	public float getDireccion()
	{
		return direccion;
	}
	
	/**
	 * este metodo asigna una velocidad a la variable de clase velocidad
	 * @param v
	 */
	public void setVelocidad(float v)
	{
		velocidad = v;
	}
	
	/**
	 * devuelve la velocidad actual
	 * @return
	 */
	public float getVelocidad()
	{
		return velocidad;
	}
	/**
	 * este metodo decrementa a la velocidad actual el decremento
	 * @param decremento
	 */
	public void frenar ( float decremento)
	{
		velocidad = velocidad - decremento;
	}
	/**
	 * este metodo suma a la velocidad el aumento
	 * @param aumento
	 */
	public void acelerar (float aumento)
	{
		velocidad = velocidad + aumento;
	}
}
