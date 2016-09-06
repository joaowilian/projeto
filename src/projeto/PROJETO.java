
package projeto;

import javax.swing.JOptionPane;

public class PROJETO {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,z;
        JOptionPane.showMessageDialog(null,"Calculadora");
        x = Integer.valueOf(JOptionPane.showInputDialog("digite um numero"));
        y = Integer.valueOf(JOptionPane.showInputDialog("digite um numero"));
        //sdfsdfsdf
        z = x+y*2;
        JOptionPane.showMessageDialog(null,"resultador = "+ z);
        
        
    }
    
}
