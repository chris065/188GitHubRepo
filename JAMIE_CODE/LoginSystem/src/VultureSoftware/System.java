/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VultureSoftware;

/**
 *
 * @author jamie2
 */
public class System {
    public static void main(String args[]) {
    
        
     /**
     * @param args the command line arguments
     */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }
}
