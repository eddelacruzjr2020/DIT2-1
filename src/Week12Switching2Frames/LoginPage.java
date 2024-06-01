/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Switching2Frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class LoginPage extends JFrame implements ActionListener{
    
    private JButton btnWelcome = new JButton("Welcome");
    
    LoginPage(){
        setTitle("Login Page");
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnWelcome.setBounds(50, 100, 100, 30);
        add(btnWelcome);
        btnWelcome.addActionListener(this);
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        WelcomePage wp = new WelcomePage();
        wp.setVisible(true);
        
    }
}
