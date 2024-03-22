package juego_cartas;

/* 
Enunciado:

Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un 
número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, 
oros y copas). Esta clase debe contener un método toString() que retorne el 
número de carta y el palo. La baraja estará compuesta por un conjunto de cartas, 
40 exactamente.

Las operaciones que podrá realizar la baraja son:

• barajar(): cambia de posición todas las cartas aleatoriamente.

• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando 
no haya más o se haya llegado al final, se indica al usuario que no hay más 
cartas.

• cartasDisponibles(): indica el número de cartas que aún se puede repartir.

• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese 
número de cartas. En caso de que haya menos cartas que las pedidas, no 
devolveremos nada, pero debemos indicárselo al usuario.

• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido 
ninguna indicárselo al usuario

• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, mostrará 
las cartas que no se han sacado. */

public class Main {

    public static void main(String[] args) {
        
        //Creamos una instancia de la clase Baraja
        Baraja b1=new Baraja();  
        
        //Barajamos las cartas para mezclar
        b1.barajar();
        
        Jugador Valen = new Jugador( "Valen");
        Jugador Fabri = new Jugador( "Fabri");
        Jugador Edu = new Jugador( "Edu");
        Jugador Franco = new Jugador( "Franco");
        
        b1.dameCarta(Franco);
        b1.dameCarta(Fabri);
        b1.dameCarta(Valen);
        b1.dameCarta(Edu);
        
        
        /*
        //Imprimimos por pantalla las cartas 
        b1.mostrarBaraja();
        
        //Imprime la siguiente carta del mazo
        b1.siguienteCarta();
        
        System.out.println("-----------------");
        b1.darCartas(3); //Repartimos 3 cartas
        
        System.out.println("-----------------");
        b1.cartasDisponibles();//Imprime la cantidad de cartas disponibles en el mazo
        
        System.out.println("-----------------");        
        b1.cartasMonton();//Imprimimos las cartas que se repartieron
        
       */
       
        
    }

}
