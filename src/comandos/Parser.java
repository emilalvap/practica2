package comandos;

import java.util.StringTokenizer;

/**
 * 
 * Comentar los comandos que que puede admitir
 * @author usuario_local
 *
 */
public class Parser {

   /* Ciclista c;
    
    Parser(Ciclista c1)
    {
	c=c1;
    }*/
    public Parser(){
	
    }
    
    public InterfazOrden DameComando(String Comando){
	
	Comandos c = Comandos.valueOf(Comando.split("\r\n")[0]);
	
	return c.getOrden();
	
    }
}
