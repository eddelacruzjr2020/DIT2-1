/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7to9;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class SwingExample1withEvents implements ActionListener{
   
    private int counter = 0;
    private JButton btnClickMe, btnReset;
    private JLabel lblClickCounter;
    
    SwingExample1withEvents(){
        JFrame f = new JFrame("My First Frame Swing");
        
        //Set Frame Size
        f.setSize(300, 300);
        
        //Create Component
        btnClickMe = new JButton("Click Me!!!");
        lblClickCounter = new JLabel("Click Counter: 0");
        btnReset = new JButton("Reset");
        
        
        //Indication location of Component button
        btnClickMe.setBounds(80, 130, 150, 30);
        lblClickCounter.setBounds(80, 100, 100, 30);
        btnReset.setBounds(80, 50, 150, 30);
        
        //Add components to frame
        f.add(btnClickMe);
        f.add(lblClickCounter);
        f.add(btnReset);
        
        //Add component to Action Listener
        btnClickMe.addActionListener(this);
        btnReset.addActionListener(this);
        
        //Layout
        f.setLayout(null);
        
        //Visible
        f.setVisible(true);
        
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnClickMe){
            counter++;
        }else if(e.getSource() == btnReset){
            counter = 0;
            
        }
        lblClickCounter.setText("Click Counter: "+counter);
    }
    
}
