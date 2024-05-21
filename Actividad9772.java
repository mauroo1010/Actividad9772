import java.util.ArrayList;

/**
 * Write a description of class Actividad9772 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Actividad9772
{
     public int cuantasPalabrasHayDeNLetras(ArrayList<String> palabras, int n) {
        int contador = 0;
        for (String palabra : palabras) {
            if (palabra.length() == n) {
                contador++;
            }
        }
        return contador;
    }
}
