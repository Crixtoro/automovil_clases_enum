package com.automovil;

/**
 * Método main que crea un automovil, imprime sus datos en pantalla y
 * realiza varios cambios en su velocidad
 */
public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", 2018, "3", TipoCombustible.DIESEL,
                TipoAutomovil.EJECUTIVO, 5, 6, 100, Color.NEGRO);
        auto1.mostrar();
        auto1.setVelocidadActual(60);
        System.out.println("Velocidad actual: " + auto1.getVelocidadActual() + "Km/h");
        auto1.acelerar(20);
        System.out.println("Velocidad actual: " + auto1.getVelocidadActual() + "Km/h");
        auto1.desacelerar(40);
        System.out.println("Velocidad actual: " + auto1.getVelocidadActual() + "Km/h");
        auto1.frenar();
        auto1.desacelerar(10);
    }
}