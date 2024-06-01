/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12FrameDemo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class LoginPage extends JFrame implements WindowListener{
    
    private JButton btnLogin = new JButton("Login");
    
    LoginPage(){
        setSize(300, 300);
        setTitle("Login Page");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnLogin.setBounds(50, 50, 100, 30);
        add(btnLogin);
        addWindowListener(this);
        setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Windows is opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Windows is closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Windows is closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Windows is minized");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Windows is maximized");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Windows is activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Windows is deactivated");
    }
    
    
}
