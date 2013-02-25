package comandos;

import interfaceMain.InterfaceEjecuta;

public class ComandoNinguno implements InterfazInstruccion {
    public ComandoNinguno() {
	// System.out.println("NO EXISTE EL COMANDO");
    }

    @Override
    public void ejecuta() {
	System.out.println("NINGUNO");
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
