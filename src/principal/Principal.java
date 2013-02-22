package principal;

//import operacionesConFicheros.*;
import interfaceMain.InterfaceEjecuta;
import interfaceMain.InterfaceSalida;

import java.io.*;

import java.util.ArrayList;

import persona.Ciclista;
import salidaDeDatos.SalidaDeDatos;
import tiempo.Reloj;
import bicicleta.Bicicleta;
import java.util.*;
import comandos.InterfazInstruccion;
/*
import comandos.Comandos;
import comandos.InterfazOrden;*/
import comandos.Parser;

import entradaDeDatos.Entrada;
import entradaDeDatos.GeneraMatrizDeStringTokenizer;
import factoresExternos.*;

/**
 * Clase Principal del programa
 * 
 * @author Juan Carlos Marco y Juan Luis PÃ©rez
 * 
 */

public class Principal {

    private ArrayList<Object> listaejecuta;
    private ArrayList<Object> listasalida;
    private Parser Parsercomandos;
    

    // SalidaDeDatos salida;

    public static void main(String args[]) 
    {

	Principal p = new Principal();
	p.inicia();
	p.ejecuta();
	p.finaliza();

    }

    public void inicia() 
    {
	listaejecuta = new ArrayList<Object>();
	listasalida = new ArrayList<Object>();

	int dientesporpinon[] = { 17, 16, 15, 14, 13, 12 };
	int dientesporplato[] = { 36, 40, 44 };
	InterfaceEjecuta bici1 = new Bicicleta(dientesporpinon.length,
		dientesporplato.length, 1, dientesporpinon, dientesporplato,
		0.6858);
	InterfaceEjecuta reloj = new Reloj();
	InterfaceEjecuta ciclista1 = new Ciclista((Bicicleta) bici1);
	InterfaceEjecuta parser = new Parser();

	listaejecuta.add(ciclista1);
	listaejecuta.add(reloj);
	listaejecuta.add(bici1);
	listaejecuta.add(parser);

	Parsercomandos = new Parser();
	
	listasalida.add(reloj); 
	listasalida.add(bici1);
	listasalida.add(ciclista1);
	 

    }

    public void ejecuta() 
    {
	int contador = 0; // Contara los segundos de ejecucion del programa
	int limite = 60; // Se establecera el limite en SEGUNDOS de la ejecucion
			 // del programa
	
	
	while (contador < limite) 
	{
	
	    for (Object c : listaejecuta) 
	    {
		((InterfaceEjecuta) c).ejecuta();
	    }

	    for (Object c : listasalida) 
	    {
		((InterfaceSalida) c).muestra();
	    }
	    /*
	    orden = Parsercomandos.DameComando(entrada_de_datos_por_teclado
		    .leer());
		    */
	    contador++;
	}
    }

    public void finaliza() 
    {

    }

}
