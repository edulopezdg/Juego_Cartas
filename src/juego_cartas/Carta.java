package juego_cartas;

public class Carta {
    
    //Atributos de la clase Carta
    private String palo;
    private Integer numero;
    
    //Constructor
    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }
    
    //metodos Getter & Setter
    public String getPalo() {
        return palo;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return numero + " de " + palo;
    }

}
