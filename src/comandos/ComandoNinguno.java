package comandos;

import interfaceMain.InterfaceEjecuta;

public class ComandoNinguno extends InterfazInstruccion implements InterfaceEjecuta
{
    public ComandoNinguno() 
    {
	//System.out.println("NO EXISTE EL COMANDO");
    }

    @Override
    public void ejecuta() 
    {
	System.out.println("NINGUNO");
	// TODO Auto-generated method stub
	
    }
}
