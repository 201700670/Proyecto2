/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static proyectoprueba.ArchivoEquipos.datos;

/**
 *
 * @author Andrea Palomo
 */
public class ArchivoJugadores {

    public static String[] datos;

    public void mostrar() throws IOException {
        String ARCHIVO = "archivoj.csv";
        BufferedReader br = null;
        String line = "";
        //Se define separador ","
        String COMAS = ",";
        try {
            br = new BufferedReader(new FileReader(ARCHIVO));
            while ((line = br.readLine()) != null) {
                datos = line.split(COMAS);
                
                //OBTIENE LOS DATOS Y LOS COLOCA EN NUESTRA LISTA 

                Registrosjugadores.listitajugadores.insertarinicio(datos[0], datos[1], datos[2],datos[3],datos[4]);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
