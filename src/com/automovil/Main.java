package com.automovil;

/**
 * Método main que crea un automovil, imprime sus datos en pantalla y
 * realiza varios cambios en su velocidad
 */
public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", 2018, "3", TipoCombustible.DIESEL,
                TipoAutomovil.EJECUTIVO, 5, 6, 100, Color.NEGRO, true);
        auto1.mostrar();
        auto1.setVelocidadActual(60);
        System.out.println("Velocidad actual: " + auto1.getVelocidadActual() + "Km/h");
        auto1.acelerar(20);
        System.out.println("Velocidad actual: " + auto1.getVelocidadActual() + "Km/h");
        auto1.desacelerar(40);
        System.out.println("Velocidad actual: " + auto1.getVelocidadActual() + "Km/h");
        auto1.frenar();
        auto1.desacelerar(10);
        //auto1.acelerar(110);
        //auto1.acelerar(110);
        System.out.println(auto1.getMulta());

        Automovil auto2 = new Automovil("Chevrolet", 2019, "2", TipoCombustible.GASOLINA,
                TipoAutomovil.EJECUTIVO, 5, 5, 120, Color.NEGRO, false);
        auto2.acelerar(130);
        auto2.acelerar(130);
        auto2.acelerar(130);
        System.out.println(auto2.getMulta());

        auto1.consultaMultas();
        auto2.consultaMultas();
    }
}