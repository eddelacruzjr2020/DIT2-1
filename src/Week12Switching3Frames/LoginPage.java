/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Switching3Frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class LoginPage extends JFrame implements ActionListener{
    
    private JButton btnWelcome = new JButton("Welcome");
    private JButton btnHome = new JButton("Home");
    
    LoginPage(){
        setTitle("Login Page");
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Location of Buttons
        btnWelcome.setBounds(50, 100, 100, 30);
        btnHome.setBounds(160, 100, 100, 30);
        
        //Add buttons to JFrame
        add(btnHome);
        add(btnWelcome);
        
        //Add buttons to ActionListener
        btnHome.addActionListener(this);
        btnWelcome.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource() == btnWelcome){
            WelcomePage wp = new WelcomePage();
            wp.setVisible(true);
        }else if (e.getSource() == btnHome) {
            HomePage hp = new HomePage();
            hp.setVisible(true);
        }
        
    }
}
