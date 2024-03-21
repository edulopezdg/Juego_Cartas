
package juego_cartas;

import java.util.ArrayList;
import java.util.List;


public class Juego {
    //Creamos 2 vectores
    String[] numCartas = new String[]{"1","2","3","4","5","6","7","10","11","12"}; //Aca vamos a guardar los numeros
    String[] palos = new String[]{"Oro","Espada","Basto","Copa"}; //Aca vamos a guardar los palos
    
    //Creamos 2 arraylist
    List<String> mazo = new ArrayList<>();
    
    //Creamos un metodo para llenar el mazo
    public void llenarMazo(){
        for (String i : palos) {
            for (String j : numCartas) {
                mazo.add(i+j);
            }
        }
    }
    
    //Creamos un metodo para mostrar el mazo
    public void mostrarBaraja(){
        int cont = 0;
        for (String i : mazo) {
            cont ++;
            System.out.println(i );
            if (cont == 10) {
                System.out.println("----------------");
                cont = 0;
                
            }
        }
    }
}
