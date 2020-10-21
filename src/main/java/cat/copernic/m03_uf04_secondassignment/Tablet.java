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
public class Tablet extends DispositivoMobil {
    
    public Tablet(String nombreDispositivo, String descripcionDispositivo, double precioDispositivo) {
        super(nombreDispositivo, descripcionDispositivo, precioDispositivo);
    }

    @Override
    public void reset() {
        System.out.println("Reseteando tablet...");
    }

    

}
