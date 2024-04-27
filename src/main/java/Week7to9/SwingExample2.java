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
public class SwingExample2 extends JFrame{
    
    SwingExample2(){
        
        //Frame Diz
        setSize(500, 500);
        
        //Create components
        JLabel lblHeader = new JLabel("My Login Page");
        JTextField txtfldUsername = new JTextField();
        JTextField txtfldPasswod = new JTextField();
        JLabel lblUsername = new JLabel("Username");
        JLabel lblPassword = new JLabel("Password");
            
        //Location of components
        lblHeader.setBounds(200, 100, 100, 50);
        txtfldUsername.setBounds(50, 300, 100, 20);
        txtfldPasswod.setBounds(170, 300, 100, 20);
        lblUsername.setBounds(50, 320, 100, 20);
        lblPassword.setBounds(170, 320, 100, 20);
        

        //Add to Frame
        add(lblHeader);
        add(txtfldUsername);
        add(txtfldPasswod);
        add(lblUsername);
        add(lblPassword);
        
        //Layout
        setLayout(null);
        
        //Visible 
        setVisible(true);
      
        
    }
}
