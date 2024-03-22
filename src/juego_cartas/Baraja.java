package juego_cartas;

import java.util.ArrayList;
import java.util.List;

public class Baraja {

    private List<Carta> mazo = new ArrayList<>();
    private int entregadas;
    private List<Carta> monton = new ArrayList<>();

    public Baraja( ) {
        llenarBaraja();
    }

    public void barajar() {
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

    public List<Carta> getMazo() {
        return mazo;
    }

    public int getEntregadas() {
        return entregadas;
    }

    public List<Carta> getMonton() {
        return monton;
    }
    
  
  
  
}
