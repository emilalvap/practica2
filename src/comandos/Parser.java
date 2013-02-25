package comandos;

import interfaceMain.InterfaceEjecuta;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import entradaDeDatos.EntradaTeclado;

/**
 * 
 * Comentar los comandos que que puede admitir
 * 
 * @author usuario_local
 * 
 */
<<<<<<< HEAD
public class Parser implements InterfaceEjecuta {
=======
public class Parser extends EntradaTeclado implements InterfaceEjecuta 
{
>>>>>>> branch 'master' of https://github.com/juancly/practica2.git

    EntradaTeclado lectura;
    InterfazInstruccion instruccion;
    Object objeto;

    public Parser(Object obj) {

	objeto = obj;
	// entrada = new EntradaTeclado(new InputStreamReader(System.in));
    }

    public InterfazInstruccion DameComando(String comando) {

	return Comandos.existe(comando.split("\n")[0].split("\r")[0])
		.getInstruccion();
    }

    @Override
    public void ejecuta() {

	instruccion = DameComando(lectura.leer());
	instruccion.ejecuta();
    }
}
