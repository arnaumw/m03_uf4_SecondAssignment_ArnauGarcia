/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;



/**
 *
 * @author pep
 */
public class M03_UF04_SecondAssignment {
    
    public static void main(String[] args) {
        
        Dispositivo d1 = new Ordenador("Lenovo", "hola soy lenovo" , 400.0);
        Dispositivo t1 = new TerminalDeVenta("Terminal 1", "Nueva Terminal de Venta", 500.0);
        Dispositivo d2 = new Tablet("Tablet", "Nueva Tablet", 150.0);
        d2.conecta();
        d2.desconecta();
        d2.reset();
    }
    
}
