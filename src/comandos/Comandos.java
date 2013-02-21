package comandos;

import factoresExternos.MiViento;

public enum Comandos {

    // FRENAR(new InterfazOrden())
    RELOJ(new MostrarReloj()), NINGUNA(new ComandoNinguno()), DESCONOCIDO(
	    new ComandoDesconocido());

    public InterfazOrden getOrden() {
	return orden;
    }

    InterfazOrden orden;

    Comandos(InterfazOrden nueva_orden) {
	orden = nueva_orden;
    }

    public static Comandos existe(String comando) {
	Comandos comando_valido = DESCONOCIDO;

	for (Comandos c : Comandos.values()) {
	    if (comando.equalsIgnoreCase(c.name())) {
		comando_valido = c;
	    }
	}

	return comando_valido;
    }

}
