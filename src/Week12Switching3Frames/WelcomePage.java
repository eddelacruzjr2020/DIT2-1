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
public class WelcomePage extends JFrame implements ActionListener{
    
    private JButton btnLogin = new JButton("Login");
    private JButton btnHome = new JButton("Home");
    
    WelcomePage(){
        setTitle("Welcome Page");
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Location of Buttons
        btnLogin.setBounds(50, 100, 100, 30);
        btnHome.setBounds(160, 100, 100, 30);
        
        //Add buttons to JFrame
        add(btnHome);
        add(btnLogin);
        
        //Add buttons to ActionListener
        btnHome.addActionListener(this);
        btnLogin.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource() == btnLogin){
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
        }else if (e.getSource() == btnHome) {
            HomePage hp = new HomePage();
            hp.setVisible(true);
        }
        
    }
}
