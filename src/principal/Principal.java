/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import javax.swing.JOptionPane;

/**
 *
 * @author josed
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma suma=new Suma();
        Resta resta=new Resta();
        Multiplicacion producto=new Multiplicacion();
        
        JOptionPane.showMessageDialog(null, "Soy el main");
        suma.mensaje1();
        resta.mensaje2();
        producto.mensaje3();
        
        
    }
    
}
