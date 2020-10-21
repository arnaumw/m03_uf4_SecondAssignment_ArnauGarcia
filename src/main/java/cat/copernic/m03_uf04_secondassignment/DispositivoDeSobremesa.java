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
public abstract class DispositivoDeSobremesa extends Dispositivo {
    
    //Constructor de DispositivoDeSobremesa. 
    public DispositivoDeSobremesa(String nombreDispositivo, String descripcionDispositivo, double precioDispositivo) {
        super(nombreDispositivo, descripcionDispositivo, precioDispositivo);
    }

    @Override
    public String toString() {
        return "DispositivoDeSobremesa{" + '}';
    }

}
