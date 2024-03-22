package juego_cartas;

public class Carta {

    private String palo;
    private Integer numero;

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }
//esto es un getter te trae el objeto

    public String getPalo() {
        return palo;
    }
//esto es un setter cambia el objeto 

    public void setPalo(String palo) {
        this.palo = palo;
    }
//esto es un getter te trae el objeto

    public Integer getNumero() {
        return numero;
    }
//esto es un setter cambia el objeto

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", numero=" + numero + '}';
    }

}
