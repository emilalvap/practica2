package comandos;

import interfaceMain.InterfaceEjecuta;

public interface InterfazInstruccion extends InterfaceEjecuta {

    public void parse();

    public void execute();

    public void configurarContexto();

    public void obtenerAyuda();

    public void ejecuta();

}
