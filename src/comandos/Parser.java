package comandos;

import interfaceMain.InterfaceEjecuta;

import java.io.InputStreamReader;
import java.util.StringTokenizer;

import entradaDeDatos.Entrada;

/**
 * 
 * Comentar los comandos que que puede admitir
 * 
 * @author usuario_local
 * 
 */
public class Parser implements InterfaceEjecuta 
{

    /*
     * Ciclista c;
     * 
     * Parser(Ciclista c1) { c=c1; }
     */
    Entrada entrada;
    public Parser() 
    {
	entrada = new Entrada(new InputStreamReader(System.in));
    }

    public InterfazInstruccion DameComando(String Comando) 
    {

	return Comandos.existe(Comando.split("\n")[0].split("\r")[0]).getInstruccion();

    }

    @Override
    public void ejecuta() {
	// TODO Auto-generated method stub
	//entrada.leer();
	DameComando(entrada.leer());
    }
}
