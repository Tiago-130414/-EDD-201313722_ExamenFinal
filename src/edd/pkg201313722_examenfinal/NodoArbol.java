package edd.pkg201313722_examenfinal;
/**
 *
 * @author santi
 */
public class NodoArbol {
    int carnet;
    String nombre;
    boolean esPadre;
    int fe;
    int altura;

    public NodoArbol(int carnet, String nombre) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.esPadre = false;
        this.fe = 0;
        this.altura = 1;
    }
    
    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
