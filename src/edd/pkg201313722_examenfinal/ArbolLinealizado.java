package edd.pkg201313722_examenfinal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class ArbolLinealizado {

    NodoArbol[] arbolLN;
    NodoArbol[] datosCSV;
    int cont = 0;

    public ArbolLinealizado() {
        this.arbolLN = new NodoArbol[100];
        for (int i = 0; i < arbolLN.length; i++) {
            arbolLN[i] = new NodoArbol(-1, " ");
        }
        this.datosCSV = new NodoArbol[100];
        for (int i = 0; i < datosCSV.length; i++) {
            datosCSV[i] = new NodoArbol(-1, " ");
        }
        menu();
        //insertar("2313", "safasd");
    }

    public void leerCsv(String nombreAr) {
        String csvFile = nombreAr.toString();
        BufferedReader br = null;
        String line;
        int cont = 0;
        String separador = ",";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(separador);
                if (!datos[0].equals("carne")) {
                    datosCSV[cont].carnet = Integer.parseInt(datos[0]);
                }
                if (!datos[1].equals("nombre")) {
                    datosCSV[cont].nombre = datos[1];
                }
                if (!datos[0].equals("carne") && !datos[1].equals("nombre")) {
                    cont++;
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

    public void insertar(int cnt, String nom) {

        if (this.arbolLN[0].carnet == -1) {
            this.arbolLN[0].carnet = cnt;
            this.arbolLN[0].nombre = nom;
        } else {
            insertarAVL(cnt, nom);
        }
    }

    public void insertarAVL(int cnt, String nom) {
        //insercion de arbol
    }

    public int calcularIZQ(int ind) {
        int calc;
        calc = (2 * ind) + 1;
        return calc;
    }

    public int calcularDER(int ind) {
        int calc;
        calc = (2 * ind) + 2;
        return calc;
    }

    public int calcularPadre(int ind) {
        int calc;
        calc = ((ind - 1) / 2);
        return calc;
    }

    public void imprimir() {
        for (int i = 0; i < datosCSV.length; i++) {
            System.out.println("indice: " + i + "\t" + datosCSV[i].carnet + "\t" + datosCSV[i].nombre);
        }
    }

    public void menu() {
        int op;
        String nomArc;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("--------- No Me Quiero Ir Sr.Stark ---------");
            System.out.println("1.- Carga Archivos");
            System.out.println("2.- Generar Reportes");
            System.out.println("3.- Salir");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    menuLeerArchivo();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (true);

    }

    public void menuLeerArchivo() {
        String nomArc;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo: ");
        nomArc = entrada.nextLine();
        System.out.println("Cargado a vector Exitosamente");
        leerCsv(nomArc);
    }
}
