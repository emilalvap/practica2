package comandos;

import interfaceMain.InterfaceEjecuta;

public abstract class InterfazInstruccion implements InterfaceEjecuta
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
    public void ejecuta()
    {
	comando.ejecuta();
    }

}
