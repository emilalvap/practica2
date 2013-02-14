package test;

import static org.junit.Assert.*;

import org.junit.Before;

import interfaceMain.InterfaceEjecuta;
import persona.*;
import bicicleta.*;
import tiempo.*;
import salidaDeDatos.*;
public class Test 
{
	Ciclista ciclista;
	Reloj reloj;
	Bicicleta bici;
	int dientesporpinon[] = {6,5,4,3,2,1};
	int dientesporplato[] = {2,3,4};
	@Before
	public void setUp()
	{

		bici = new Bicicleta(dientesporpinon.length, dientesporplato.length, 
				1,dientesporpinon,dientesporplato,0.6858);
		reloj = new Reloj();
		ciclista = new Ciclista(bici);
	}
	@SuppressWarnings("deprecation")
	@org.junit.Test
	public void test() 
	{

		//test bicicleta
		bici.setAsignaNumeroDientesPinon(dientesporpinon);
		bici.setAsignaNumeroDientesPlato(dientesporplato);
		assertArrayEquals(dientesporpinon,bici.getDientesPinon());
		assertArrayEquals(dientesporplato,bici.getDientesPlato());
		bici.setPedales(2);
		assertEquals(2,bici.getPedales());
		bici.setPeso(5);
		assertEquals(5,bici.getPeso(),0);
		bici.setPinonAct(1);
		assertEquals(1,bici.getPinonAct());
		bici.setPlatoAct(1);
		assertEquals(1,bici.getPlatoAct());
		bici.espacioRecorridoPorCadencia(2);
		bici.setRelacionTransmision(2, 2);
		assertEquals(dientesporpinon[2]/dientesporplato[2],bici.getRelacionTransmision(),0);


		bici.setPinon('a');
		assertEquals(bici.getPinonAct(),2);
		bici.setPinon('d');
		assertEquals(bici.getPinonAct(),1);
		bici.setPlato('a');
		assertEquals(bici.getPlatoAct(),2);
		bici.setPlato('d');
		assertEquals(bici.getPlatoAct(),1);


		bici.setEspacioPorPedalada(2);
		assertEquals(2,bici.getEspacioRecorrido(),0);

		bici.setNumsillin(1);
		assertEquals(1,bici.getNumsillin());

		assertEquals(dientesporplato[2],bici.getDientesPlato(2));
		assertEquals(dientesporpinon[2],bici.getDientesPinon(2));

		bici.setRelacionTransmision(2, 2);
		assertEquals(bici.getDientesPinon(2)/bici.getDientesPlato(2),bici.getRelacionTransmision(),0);

		bici.setRadioRueda(2);
		assertEquals(2,bici.getRadioRueda(),0);

		bici.setCadencia(2);
		assertEquals(2,bici.getCadencia(),0);

		//pruebas reloj
		reloj.cuentaReloj();
		int hora[] =  {1,0,0};
		assertArrayEquals(hora,reloj.devuelveTiempo());
		assertEquals(1,reloj.devuelveSegundos(),0);
		reloj.ejecuta();
		assertEquals(2,reloj.devuelveSegundos(),0);

		//pruebas ciclista
		ciclista.pedalear(2);
		assertEquals(2,bici.getCadencia(),0);

		ciclista.setRumbo(4, bici);
		assertEquals(4,bici.getDireccion(),0);

		ciclista.cambiarPinon('a');
		assertEquals(2,bici.getPinonAct());
		ciclista.cambiarPinon('d');
		assertEquals(1,bici.getPinonAct());
		ciclista.cambiarPlato('a');
		assertEquals(2,bici.getPlatoAct());
		ciclista.cambiarPlato('d');
		assertEquals(1,bici.getPlatoAct());
		ciclista.setBici(bici);
		assertEquals(bici, ciclista.getBici());
		/*




		 */


	}

}
