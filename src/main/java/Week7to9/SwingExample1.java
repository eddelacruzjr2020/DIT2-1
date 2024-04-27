/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7to9;

import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class SwingExample1 {
    
    SwingExample1(){
        JFrame f = new JFrame("My First Frame Swing");
        
        //Set Frame Size
        f.setSize(300, 300);
        
        //Create Component
        JButton btnClickMe = new JButton("Click Me!!!");
        
        //Indication location of Component button
        btnClickMe.setBounds(80, 130, 150, 30);
        
        //Add components to frame
        f.add(btnClickMe);
        
        //Layout
        f.setLayout(null);
        
        //Visible
        f.setVisible(true);
        
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    
}
