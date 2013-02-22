package comandos;
import interfaceMain.InterfaceEjecuta;
import persona.Ciclista;
public class ComandoAumentaCadencia extends InterfazInstruccion implements InterfaceEjecuta
{
    Ciclista ciclista;
    public ComandoAumentaCadencia() 
    {
	// TODO Auto-generated constructor stub
    }
    @Override
    public void ejecuta() 
    {
	// TODO Auto-generated method stub
	System.out.println("AUMENTACADENCIA");
    }

}
