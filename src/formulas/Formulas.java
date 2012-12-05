package formulas;

public class Formulas {

	
	/*formulas
	 espacio = Vinicial * tiempo + (1/2)*a*(t al cuadrado)
	 Vfinal = V inicial + a * t
	 cadencia = (pedaleo/minuto) * (plato/piñon) = 2 * pi * R
	 */
	/**
	 * este metodo realiza la formula de aceleracion, devolviendo la aceleracion conseguida
	 * @return
	 */
	public float aceleracion (float vinicial,float vfinal,int tiempo)
	{
		float aceleracion = 0;
		
		aceleracion = (vfinal - vinicial)/tiempo;
		return aceleracion;
	}
	
	public float velocidadFinal (float vinicial,float aceleracion,int tiempo)
	{
		float vfinal = 0;
		
		vfinal = vinicial + aceleracion * tiempo;
		return vfinal;
	}
	public float espacioRecorrido (float vinicial,int tiempo,float aceleracion)
	{
		
		float espacio = 0;
		espacio = vinicial * tiempo + (1/2) * aceleracion * (tiempo * tiempo);
		return espacio ;
	}
	
}
