package andr7st.funciones;
/**
 * @author Andrés Segura
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LeerJSON {

    public LeerJSON(String rutaJSON){

        File archivo = new File(rutaJSON);

        if (archivo.exists()) {
            
            try {    
                
                JSONParser parser = new JSONParser();
                Object obj = parser.parse(new FileReader(rutaJSON));
                JSONObject archivoJSON = (JSONObject) obj;
                JSONObject propiedades = (JSONObject) archivoJSON.get("propiedades");
                
                System.out.println("File: " + archivoJSON.get("archivo").toString());
                
                // Prints "propiedades"
                System.out.println(propiedades.get("nombre").toString());
                System.out.println(propiedades.get("nickname").toString());
                System.out.println(propiedades.get("anio").toString());
                
            } 

            //catch(FileNotFoundException e){}
            catch(IOException e){

                System.err.println(e);
            }
            catch(ParseException e){

                System.err.println(e);
            } 
        }
        else {
            System.err.println(String.format("el archivo: %s\n no existe", rutaJSON));
        }
    }
}