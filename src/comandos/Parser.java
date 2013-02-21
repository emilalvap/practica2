package comandos;

import java.util.StringTokenizer;

/**
 * 
 * Comentar los comandos que que puede admitir
 * 
 * @author usuario_local
 * 
 */
public class Parser {

    /*
     * Ciclista c;
     * 
     * Parser(Ciclista c1) { c=c1; }
     */
    public Parser() {

    }

    public InterfazOrden DameComando(String Comando) {

	return Comandos.existe(Comando.split("\n")[0].split("\r")[0])
		.getOrden();

    }
}
