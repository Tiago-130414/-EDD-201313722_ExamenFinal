package edd.pkg201313722_examenfinal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author santi
 */
public class ArbolLinealizado {

    NodoArbol[] arbolLN;

    public ArbolLinealizado() {
        this.arbolLN = new NodoArbol[100];
        for (int i = 0; i < 10; i++) {
            arbolLN[i] = new NodoArbol(0, " ");
        }
        leerCsv();
    }

    public void leerCsv() {
        String csvFile = "alumnos.csv";
        BufferedReader br = null;
        String line;
        String separador = ",";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(separador);
                if (datos[0]=="carne"|| datos[1]=="nombre") {
                } else {
                    System.out.println(datos[0] +"\t"+ datos[1]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer archivo: " + e);
        } catch (IOException e) {
            System.out.println("Exception" + e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error al terminar lectura" + e);
                }
            }
        }
    }
}
