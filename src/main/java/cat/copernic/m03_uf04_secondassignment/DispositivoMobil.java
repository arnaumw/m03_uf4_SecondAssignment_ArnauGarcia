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
public abstract class DispositivoMobil extends Dispositivo {
    
    //Constructor de DispositivoMobil. 
    public DispositivoMobil(String nombreDispositivo, String descripcionDispositivo, double precioDispositivo) {
        super(nombreDispositivo, descripcionDispositivo, precioDispositivo);
    }
    
    // Metodo Reset.
    public abstract void reset();
    
}
    
