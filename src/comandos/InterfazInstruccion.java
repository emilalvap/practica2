package comandos;

public abstract class InterfazInstruccion 
{

    private Comandos comando;

    public Comandos getComando() 
    {
	return comando;
    }

    public void setComando(Comandos comando) 
    {
	this.comando = comando;
    }

}
