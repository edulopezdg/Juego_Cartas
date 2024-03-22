package juego_cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    //Atributos
    private List<Carta> mazo = new ArrayList<>();
    private int entregadas;
    private List<Carta> monton = new ArrayList<>();

    //Constructor
    public Baraja() {
        llenarBaraja();
    }

    //Metodos Getters & Setters
    public List<Carta> getMazo() {
        return mazo;
    }

    public int getEntregadas() {
        return entregadas;
    }

    public List<Carta> getMonton() {
        return monton;
    }

    //Metodo que lenara la baraja
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

    //Metodo que mezclara las cartas mediante un Shuffle
    public void barajar() {
        Collections.shuffle(mazo);
    }

    //Metodo que muestra la siguiente carta
    public Carta siguienteCarta() {
        Carta siguiente = null;
        if (mazo.size() > 0) {
            siguiente = mazo.remove(0);
            monton.add(siguiente);
            System.out.println(siguiente);
        } else {
            System.out.println("No hay mas cartas en la baraja...");
        }
        return siguiente;

    }

    //Metodo para dar cartas
    public List<Carta> darCartas(int cantidad) {
        List<Carta> cartasADar = new ArrayList<>();
        if (mazo.size() >= cantidad) {

            for (int i = 0; i < cantidad; i++) {
                cartasADar.add(siguienteCarta());
            }
        } else {
            System.out.println("no se puede dar " + cantidad + " cartas...");
        }
        return cartasADar;
    }

    //Metodo para mostrar el mazo por pantalla
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

    //Metodo para mostrar la cantidad de cartas disponibles
    public void cartasDisponibles() {
        System.out.println("La cantidad de cartas disponibles es de: " + mazo.size());
    }

    //Metodo para mostrar las cartas repartidas
    public void cartasMonton() {

        if (monton.isEmpty()) {
            System.out.println("No se han repartido cartas en esta mano");
        } else {
            System.out.println("Las cartas que se dieron son:");
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
    }

}
