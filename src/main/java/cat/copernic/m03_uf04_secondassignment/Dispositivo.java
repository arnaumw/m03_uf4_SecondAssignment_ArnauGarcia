/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

/**
 *
 * @author arnaugarciaalvarez
 */
public abstract class Dispositivo implements Conectable {
    
    private String nombreDispositivo;
    private String descripcionDispositivo;
    private double precioDispositivo;
    
    //Constructor de Dispositivo. 
    public Dispositivo(String nombreDispositivo, String descripcionDispositivo, double precioDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
        this.descripcionDispositivo = descripcionDispositivo;
        this.precioDispositivo = precioDispositivo;
    }

    
    // Getters y setters
    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public String getDescripcionDispositivo() {
        return descripcionDispositivo;
    }

    public void setDescripcionDispositivo(String descripcionDispositivo) {
        this.descripcionDispositivo = descripcionDispositivo;
    }

    public double getPrecioDispositivo() {
        return precioDispositivo;
    }

    public void setPrecioDispositivo(double precioDispositivo) {
        this.precioDispositivo = precioDispositivo;
    }

    
    // ToString
    @Override
    public String toString() {
        return "Dispositivo{" + "nombreDispositivo=" + nombreDispositivo + ", descripcionDispositivo=" + descripcionDispositivo + ", precioDispositivo=" + precioDispositivo + '}';
    }

    
    // Implementación de metodos.
    @Override
    public void conecta() {
        System.out.println("Dispositivo Conectado!");
    }

    @Override
    public void desconecta() {
        System.out.println("Dispositivo Desconectado!");
    }

    void reset() {
        System.out.println("Reseteando!");
    }

  
}
