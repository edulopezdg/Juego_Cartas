/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_cartas;

/**
 *
 * @author DELL
 */
public class Jugador {
    private String nombre;
    private int ganadas;
    private int numero;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getGanadas() {
        return ganadas;
    }

    public int getNumero() {
        return numero;
    }
    
    
}
