package paquete;
/**
 * @author Andrés Segura
 * @author Andr7st
 *  
 * - Leer un JSON: Utilizando la libraría json-simple-1.1.1.jar 
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Libreria_1 {

    public void LeerJSON(String rutaJSON){
        /**
         * - Lee e imprime varios datos por consola.
         */
        // ruta = "../Auxiliar/Archivo.json";
        JSONParser parser = new JSONParser();
        
        try {    
            //  BufferedReader BR = new BufferedReader(new FileReader(new File(ruta)));

            // Obtener el archivo de donde sacar la linea
            Object obj = parser.parse(new FileReader(rutaJSON));
            JSONObject archivoLeido = (JSONObject) obj;
            JSONObject propiedades = (JSONObject) archivoLeido.get("propiedades");

            String Archivo = archivoLeido.get("archivo").toString();
            // Guardar el contenido del json en variables String.
            String nombre = propiedades.get("nombre").toString();
            String apodo = propiedades.get("nickname").toString();
            String anio = propiedades.get("anio_inicio").toString();
            //// Una forma de guardarlo en variable Int
            //int mmiAnio = Integer.parseInt(anio);

            // Para imprimir por consola
            String imprimir = "";

            imprimir += Archivo;
            imprimir += "\n" + nombre;
            imprimir += "\n" + apodo;
            imprimir += "\n" + anio;

            System.out.println(imprimir);

        } 
        //catch (Exception e) {}
        catch(FileNotFoundException e){}
        catch(IOException e){}
        catch(ParseException e){} 
    }
}