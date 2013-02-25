package principal;

//import operacionesConFicheros.*;
import interfaceMain.InterfaceEjecuta;
import interfaceMain.InterfaceSalida;

import java.io.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import persona.Ciclista;
import salidaDeDatos.SalidaDeDatos;
import tiempo.Reloj;
import bicicleta.Bicicleta;
import java.util.*;

import mapas.MiMapa;
import comandos.InterfazInstruccion;
/*
 import comandos.Comandos;
 import comandos.InterfazOrden;*/
import comandos.Parser;

import entradaDeDatos.EntradaTeclado;
import entradaDeDatos.EntradaFichero;
import entradaDeDatos.SuperLectura;
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

    public static void main(String args[]) {

	Principal p = new Principal();
	p.inicia();
	p.ejecuta();
	p.finaliza();

    }

    public void inicia() {
	listaejecuta = new ArrayList<Object>();
	listasalida = new ArrayList<Object>();

	int dientesporpinon[] = { 17, 16, 15, 14, 13, 12 };
	int dientesporplato[] = { 36, 40, 44 };
	InterfaceEjecuta bici1 = new Bicicleta(dientesporpinon.length,
		dientesporplato.length, 1, dientesporpinon, dientesporplato,
		0.6858);
	InterfaceEjecuta reloj = new Reloj();
	InterfaceEjecuta ciclista1 = new Ciclista((Bicicleta) bici1);
	// InterfaceEjecuta parser = new Parser(ciclista1);

	SuperLectura Lectura = new SuperLectura();
	EntradaTeclado entrada_de_datos_por_teclado = new EntradaTeclado(
		Lectura.CrearLectorPorTeclado());

	listaejecuta.add(ciclista1);
	listaejecuta.add(reloj);
	listaejecuta.add(bici1);
	// listaejecuta.add(parser);

	listaejecuta.add(entrada_de_datos_por_teclado);

	// Parsercomandos = new Parser();

	listasalida.add(reloj);
	listasalida.add(bici1);
	listasalida.add(ciclista1);

    }

    public void ejecuta() {
	int contador = 0; // Contara los segundos de ejecucion del programa
	int limite = 60; // Se establecera el limite en SEGUNDOS de la ejecucion
			 // del programa
	EntradaFichero entrada = new EntradaFichero();
<<<<<<< HEAD
	MiMapaDosListas<Double, Double> mapa = new MiMapaDosListas<Double, Double>(
		entrada.cargarFicheroEnStringTokenizer("carretera.txt"));

	while (contador < limite) {

	    for (Object c : listaejecuta) {
=======
	MiMapa<Double,Double> mapa = new MiMapa<Double,Double>
	(entrada.cargarFicheroEnStringTokenizer("carretera.txt",":;"));
	

	
	
	while (contador < limite) 
	{
	   
	    for (Object c : listaejecuta) 
	    {
>>>>>>> branch 'master' of https://github.com/juancly/practica2.git
		((InterfaceEjecuta) c).ejecuta();
	    }
<<<<<<< HEAD
	    // mapa.getElementoLista1();
	    // mapa.getElementoLista2(contador);
	    // System.out.println()

	    for (Object c : listasalida) {
=======
	  
	    for (Object c : listasalida) 
	    {
>>>>>>> branch 'master' of https://github.com/juancly/practica2.git
		((InterfaceSalida) c).muestra();
	    }
<<<<<<< HEAD

	    /*
	     * orden = Parsercomandos.DameComando(entrada_de_datos_por_teclado
	     * .leer());
	     */
=======
	
>>>>>>> branch 'master' of https://github.com/juancly/practica2.git
	    contador++;
	}
    }

    public void finaliza() {

    }

}
