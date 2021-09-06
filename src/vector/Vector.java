/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernandito
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vector[]={12, 69, 42, 35, 74, 56, 87, 5, 29, 14};
        
        int max=vector[0];
        int min=vector[0];
        
        for (int i = 0; i < vector.length ; i++) {
            
            if(vector[i]>max){
                max=vector[i];
                
            }
            if (vector[i]<min){
                
                min=vector[i];
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "max="+max+"\nmin="+min);
        
        
        
    }
    
}
