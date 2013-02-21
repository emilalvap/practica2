package comandos;

public enum Comandos {

    //FRENAR(new InterfazOrden())
    MOSTRAR_RELOJ(new MostrarReloj()),
    NINGUNA(null);

    public InterfazOrden getOrden() {
        return orden;
    }
   
    InterfazOrden orden;

    Comandos(InterfazOrden nueva_orden) {
	orden = nueva_orden;
    }

}
