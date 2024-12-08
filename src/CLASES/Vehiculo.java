/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author raulc
 */
public class Vehiculo{
    private int id_vehiculo;
    private String modelo;
    private String variante;
    private int anio;
    private double precio;
    private long kilometraje;
    private String tipo_gasolina;

    public Vehiculo(int id_vehiculo, String modelo, String variante, int anio, double precio, long kilometraje, String tipo_gasolina) {
        this.id_vehiculo = id_vehiculo;
        this.modelo = modelo;
        this.variante = variante;
        this.anio = anio;
        this.precio = precio;
        this.kilometraje = kilometraje;
        this.tipo_gasolina = tipo_gasolina;
    }

    public int getAnio() {
        return anio;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public long getKilometraje() {
        return kilometraje;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo_gasolina() {
        return tipo_gasolina;
    }

    public String getVariante() {
        return variante;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setKilometraje(long kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipo_gasolina(String tipo_gasolina) {
        this.tipo_gasolina = tipo_gasolina;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }
    
    
    
}

