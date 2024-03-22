package juego_cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private List<Carta> mazo = new ArrayList<>();
    private int entregadas;
    private List<Carta> monton = new ArrayList<>();

    
    // Constructor
    
    public Baraja( ) {
        llenarBaraja();
    }
       // getter y setter
  
    public List<Carta> getMazo() {
        return mazo;
    }

    public int getEntregadas() {
        return entregadas;
    }

    public List<Carta> getMonton() {
        return monton;
    }
    
    
    
   

   
    private void llenarBaraja() {
        int[] numCartas = new int[]{1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        String[] palos = new String[]{"Oro", "Espada", "Basto", "Copa"};

        for (String i : palos) {
            for (int j : numCartas) {
                Carta c1 = new Carta(i, j);
                mazo.add(c1);
            }
        }
    }
    
     // metodo barajar
    public void barajar() {
        Collections.shuffle(mazo);
        
    }
    // metodo siguiente carta
    public Carta siguienteCarta(){
       Carta siguiente=null;
        if (mazo.size()>0) {
            siguiente=mazo.remove(0); 
            monton.add(siguiente);
            System.out.println(siguiente);
        }else{
            System.out.println("No hay mas cartas en la baraja...");
        }
        return siguiente;
        
    }
    // dar cartas
    public List<Carta> darCartas(int cantidad){
        List<Carta> cartasADar = new ArrayList<>();
        if (mazo.size() >= cantidad) {

            for (int i = 0; i < cantidad; i++) {
                cartasADar.add(siguienteCarta());
            }
        }else{
            System.out.println("no se puede dar "+cantidad+" cartas...");
        }
        return cartasADar;
    }

    //Creamos un metodo para mostrar el mazo
  public void mostrarBaraja() {
        int cont = 0;
        for (Carta i : mazo) {
            cont++;
            System.out.println(i);
            if (cont == 10) {
                System.out.println("----------------");
                cont = 0;

            }
        }
    }

  //Cartas disponibles del mazo
 public void cartasDisponibles(){
     System.out.println("La cantidad de cartas disponibles es de: " + mazo.size());
 
 }

   
  
  
}
