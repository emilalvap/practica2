package comandos;

public abstract class InterfazOrden {

    private Comandos comando;

    public Comandos getComando() {
	return comando;
    }

    public void setComando(Comandos comando) {
	this.comando = comando;
    }

}
