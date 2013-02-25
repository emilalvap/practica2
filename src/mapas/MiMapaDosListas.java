package mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import entradaDeDatos.EntradaFichero;
public class MiMapaDosListas <T,E> 
{
    
    Map<List<T>,List<E>> mapa;
    EntradaFichero fichero;
    List<T> lista1 ;
    List<E> lista2 ;
    public MiMapaDosListas(StringTokenizer tokens)
    {
	fichero = new EntradaFichero();
	List<T> lista1 = new ArrayList();
	List<E> lista2 = new ArrayList();
	//F[] matriz = fichero.convertirAArrayFichero("carretera.txt");
	
	
	Map<List<T>,List<E>> mapa  = new HashMap<List<T>,List<E>>();
	int i = 0;
	while(tokens.hasMoreTokens())
	{
	    if(i % 2 == 0)
	    {
		//System.out.println(tokens.nextToken());
		lista1.add((T) tokens.nextToken());
		
	    }
	    if(i%2 == 1)
	    {
		//System.out.println(tokens.nextToken());
		lista2.add((E) tokens.nextToken());
		//lista1.add();
	    }
	   
	   // System.out.println(lista1.get(i));
	    i++;
	}
	mapa.put(lista1, lista2);
	
    }
    public Map getMapa()
    {
	return mapa;
	
    }
    public List<T> getLista1()
    {
	return lista1;
	
    }
    public List<E> getLista2()
    {
	return lista2;
	
    }
    public T getElementoLista1(int ele)
    {
	return lista1.get(ele);
    }
    public E getElementoLista2(int ele)
    {
	return lista2.get(ele);
    }
    
}
