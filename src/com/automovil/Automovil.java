package com.automovil;

/**
 * Esta clase define objetos de tipo Automóvil con un marca, modelo
 * motor, tipo de combustible, tipo de automóvil, número de puertas,
 * cantidad de asientos, velocidad máxima, color y velocidad actual.
 * @version 9.29.2023
 * @author Christian Toro
 */
public class Automovil {
    private String marca;
    private int anhoFabricacion;
    private String motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int cantidadPuertas;
    private int asientos;
    private int velocidadMax;
    private Color color;
    private int velocidadActual;

    /**
     * Método constructor con todos los parámetros
     * @param marca
     * @param anhoFabricacion
     * @param motor
     * @param tipoCombustible
     * @param tipoAutomovil
     * @param cantidadPuertas
     * @param asientos
     * @param velocidadMax
     * @param color
     */
    public Automovil(String marca, int anhoFabricacion, String motor,
                     TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil,
                     int cantidadPuertas, int asientos, int velocidadMax,
                     Color color) {
        this.marca = marca;
        this.anhoFabricacion = anhoFabricacion;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.cantidadPuertas = cantidadPuertas;
        this.asientos = asientos;
        this.velocidadMax = velocidadMax;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }

    /**
     * Métodos Getter and Setter
     */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnhoFabricacion() {
        return anhoFabricacion;
    }

    public void setAnhoFabricacion(int anhoFabricacion) {
        this.anhoFabricacion = anhoFabricacion;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    /**
     * Método que incrementa la de velocidad de un automovil
     * @param incrementoVelocidad parametro que incrementa ls velocidad abtual del vehiculo
     */
    void acelerar(int incrementoVelocidad) {
        if ((velocidadActual + incrementoVelocidad) > velocidadMax) {
            System.out.println("No se puede incrementar la velocidad");
            System.out.println("La velocidad máxima permitida es de 100Km/h");
        } else {
            velocidadActual = velocidadActual + incrementoVelocidad;
        }
    }

    /**
     * Método para disminuir la velocidad del vehículo, primero verificamos
     * que el valor no vaya a ser negativo
     * @param decrementoVelocidad contidad que vamos a disminuir la velocidad
     */
    void desacelerar(int decrementoVelocidad) {
        if ((velocidadActual - decrementoVelocidad) < 0) {
            System.out.println("No se puede disminuir la velocidad a un nivel negativo");
        } else {
            velocidadActual = velocidadActual - decrementoVelocidad;
        }
    }

    /**
     * Método para frenar el vehículo
     */
    void frenar(){
        velocidadActual = 0;
    }

    /**
     * Método para calcular el tiempo estimado de llegada
     * @param distancia distancia a recorrer en km
     */
    void tiempoEstimadoLlegada(double distancia) {
        System.out.println("El tiempo estimado de llegada es de: " + distancia/velocidadActual);
    }

    /**
     * Método para mostrar toda la información del vehiculo
     */
    void mostrar() {
        System.out.println("Marca: " + marca);
        System.out.println("Año de fabriacación: " + anhoFabricacion);
        System.out.println("Motor: " + motor);
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Tipo de automóvil: " + tipoAutomovil);
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
        System.out.println("Número de asientos: " + asientos);
        System.out.println("Color: " + color);
    }

}
