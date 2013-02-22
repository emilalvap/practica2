package comandos;

import interfaceMain.InterfaceEjecuta;

public class ComandoDesconocido extends InterfazInstruccion implements InterfaceEjecuta
{
    public ComandoDesconocido() 
    {
	//System.out.println("Comando desconocido");
    }

    @Override
    public void ejecuta() 
    {
	System.out.println("DESCONOCIDO");
	// TODO Auto-generated method stub
	
    }
}
