package comandos;

import interfaceMain.InterfaceEjecuta;

public class ComandoDesconocido implements InterfazInstruccion {
    public ComandoDesconocido() {
	// System.out.println("Comando desconocido");
    }

    @Override
    public void ejecuta() {
	System.out.println("DESCONOCIDO");
	// TODO Auto-generated method stub

    }

    @Override
    public void parse() {
	// TODO Auto-generated method stub

    }

    @Override
    public void execute() {
	// TODO Auto-generated method stub

    }

    @Override
    public void configurarContexto() {
	// TODO Auto-generated method stub

    }

    @Override
    public void obtenerAyuda() {
	// TODO Auto-generated method stub

    }
}
