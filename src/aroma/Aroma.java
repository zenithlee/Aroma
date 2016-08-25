/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aroma;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author AI
 */
public class Aroma {

    SimplePanel panel;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
     private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? "+
                SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Swing Paint Demo");
        f.add( new SimplePanel());
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250,250);
        f.setVisible(true);
    }
    
}
