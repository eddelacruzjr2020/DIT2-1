/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13.AddImageSample;

import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Graphics101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first JFrame");
        frame.setSize(600, 600);  
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Edmundo Dela Cruz\\Documents\\NetBeansProjects\\OOPTrialProject\\src\\main\\java\\Week13\\AddImageSample\\logo.png").getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH)));
        frame.add(label);
        frame.pack();
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    
}
