package paquete;
/**
 * @author Andrés Segura
 * @author Andr7st
 *  
 * - Leer un JSON, usando la librería.
 */
public class Main {
    public static void main(String[] args) {

        // Donde se encuentra el directorio donde estarán guardados lor archivos *.json
        final String ruta = "../Auxiliar/";

        // Libreía 1
        Libreria_1 leerJSON1 = new Libreria_1();
        String archivo = ruta + "Archivo.json" ;

        leerJSON1.LeerJSON(archivo);
    }
}