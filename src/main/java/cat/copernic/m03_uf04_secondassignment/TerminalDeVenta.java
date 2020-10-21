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
public class TerminalDeVenta extends DispositivoDeSobremesa {

    public TerminalDeVenta(String nombreDispositivo, String descripcionDispositivo, double precioDispositivo) {
        super(nombreDispositivo, descripcionDispositivo, precioDispositivo);
    }

    
    @Override
    public void desconecta() {
        //super.desconecta(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Terminal de Venta Desconectado.");
    }

    @Override
    public void conecta() {
        //super.conecta(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Terminal de Venta Conectado.");
    }
    
    
    
}
