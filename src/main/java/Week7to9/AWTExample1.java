/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7to9;

import java.awt.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class AWTExample1 {
    
    AWTExample1(){
        Frame f = new Frame("My First Frame AWT");
        
        //Set Frame Size
        f.setSize(300, 300);
        
        //Create Component
        Button btnClickMe = new Button("Click Me!!!");
        
        //Indication location of Component button
        btnClickMe.setBounds(130, 130, 80, 30);
        
        //Add components to frame
        f.add(btnClickMe);
        
        //Layout
        f.setLayout(null);
        
        //Visible
        f.setVisible(true);
    }
    
}
