//package factoresExternos;
//
//import operacionesConFicheros.ConvertirFicheroAMatriz;
//
///**
// * esta clase crea las condiciones del viento a partir de un fichero
// * 
// * @author juancly
// * 
// */
//public class Viento {
//
//    ConvertirFicheroAMatriz fichero;
//    String ruta;
//    int matriz[];
//
//    /**
//     * recibe la direccion de la ruta en la que se encuentra el fichero de
//     * Viento
//     * 
//     * @param miruta
//     */
//
//    public Viento(String miruta) {
//	ruta = miruta;
//	fichero = new ConvertirFicheroAMatriz();
//	matriz = fichero.convertirFicheroAMatrizDeEnteros(ruta, ",;");
//    }
//
//    /**
//     * la matriz resultante es del tipo entero y su composicion es la siguiente
//     * matriz[0] = metro en el que cambia la pendiente matriz[1] =pendiente que
//     * ira desde 90 hasta -90
//     */
//    public int[] getMatriz() {
//
//	return matriz;
//    }
//}