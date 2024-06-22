/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15and16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class McDollibee extends JFrame implements ActionListener{
    
    private JLabel hdrMcDollibee, lblBurger, lblFries, lblSoda, nbrBurger, nbrFries, nbrSoda;
    private JButton btnAddBurger, btnMinusBurger, btnAddFries, btnMinusFries, btnAddSoda, btnMinusSoda, btnReviewOrder, btnResetOrder;
    private JComboBox<String> cmbBurger, cmbFries, cmbSoda;
    private JTextArea txaOrder;
    
    private static final String[] size = {"Small", "Medium", "Large"};
    private int intBurger = 0;
    private int intFries = 0;
    private int intSoda = 0;
    
    McDollibee(){
        setName("McDollibee");
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        hdrMcDollibee = new JLabel("McDollibee", SwingConstants.CENTER);
        // y axis, x axis, width, height
        hdrMcDollibee.setBounds(0, 10, 600, 30);
        add(hdrMcDollibee);
        
        //Burger
        lblBurger = new JLabel("Burger:");
        lblBurger.setBounds(50, 50, 100, 30);
        add(lblBurger);
        
        nbrBurger = new JLabel("0");
        nbrBurger.setBounds(160, 50, 100, 30);
        add(nbrBurger);
        
        btnAddBurger = new JButton("+");
        btnAddBurger.setBounds(200, 50, 50, 30);
        add(btnAddBurger);
        
        btnMinusBurger = new JButton("-");
        btnMinusBurger.setBounds(260, 50, 50, 30);
        add(btnMinusBurger);
        
        cmbBurger = new JComboBox<>(size);
        cmbBurger.setBounds(330, 50, 80, 30);
        add(cmbBurger);
        
        //Fries
        lblFries = new JLabel("Fries:");
        lblFries.setBounds(50, 100, 100, 30);
        add(lblFries);
        
        nbrFries = new JLabel("0");
        nbrFries.setBounds(160, 100, 100, 30);
        add(nbrFries);
        
        btnAddFries = new JButton("+");
        btnAddFries.setBounds(200, 100, 50, 30);
        add(btnAddFries);
        
        btnMinusFries = new JButton("-");
        btnMinusFries.setBounds(260, 100, 50, 30);
        add(btnMinusFries);
        
        cmbFries = new JComboBox<>(size);
        cmbFries.setBounds(330, 100, 80, 30);
        add(cmbFries);
        
        //Soda
        lblSoda = new JLabel("Soda:");
        lblSoda.setBounds(50, 150, 100, 30);
        add(lblSoda);
        
        nbrSoda = new JLabel("0");
        nbrSoda.setBounds(160, 150, 100, 30);
        add(nbrSoda);
        
        btnAddSoda = new JButton("+");
        btnAddSoda.setBounds(200, 150, 50, 30);
        add(btnAddSoda);
        
        btnMinusSoda = new JButton("-");
        btnMinusSoda.setBounds(260, 150, 50, 30);
        add(btnMinusSoda);
        
        cmbSoda = new JComboBox<>(size);
        cmbSoda.setBounds(330, 150, 80, 30);
        add(cmbSoda);
        
        //Review Order 
        btnReviewOrder = new JButton("Review Order");
        btnReviewOrder.setBounds(50, 200, 150, 30);
        add(btnReviewOrder);
        
         //Review Order 
        btnResetOrder = new JButton("Reset Order");
        btnResetOrder.setBounds(220, 200, 150, 30);
        add(btnResetOrder);
        
        txaOrder = new JTextArea();
        txaOrder.setBounds(50, 250, 500, 300);
        txaOrder.setEditable(false);
        add(txaOrder);
        
        //Adding all btn to actionlister
        btnAddBurger.addActionListener(this);
        btnMinusBurger.addActionListener(this);
        btnAddFries.addActionListener(this); 
        btnMinusFries.addActionListener(this); 
        btnAddSoda.addActionListener(this); 
        btnMinusSoda.addActionListener(this); 
        btnReviewOrder.addActionListener(this); 
        btnResetOrder.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAddBurger){
            intBurger++;
            nbrBurger.setText(String.valueOf(intBurger));
        }else if(e.getSource() == btnMinusBurger){
            if(intBurger > 0){
                intBurger--;
                nbrBurger.setText(String.valueOf(intBurger));
            }
        }
        else if(e.getSource() == btnAddFries){
            intFries++;
            nbrFries.setText(String.valueOf(intFries));
        }
        else if(e.getSource() == btnMinusFries){
            if(intFries > 0){
                intFries--;
                nbrFries.setText(String.valueOf(intFries));
            }
        }
        else if(e.getSource() == btnAddSoda){
            intSoda++;
            nbrSoda.setText(String.valueOf(intSoda));
        }
        else if(e.getSource() == btnMinusSoda){
            if(intSoda > 0){
                intSoda--;
                nbrSoda.setText(String.valueOf(intSoda));
            }
        }
        else if(e.getSource() == btnReviewOrder){
            double totalCost = 0.0;
         
            totalCost+=calculateCost(intBurger, (String)cmbBurger.getSelectedItem());
            totalCost+=calculateCost(intFries, (String)cmbFries.getSelectedItem());
            totalCost+=calculateCost(intSoda, (String)cmbSoda.getSelectedItem());
            
            txaOrder.setText("Burger ("+cmbBurger.getSelectedItem()+"): "+intBurger+"\n" +
            "Fries ("+cmbFries.getSelectedItem()+"): "+intFries+"\n" +
            "Soda ("+cmbSoda.getSelectedItem()+"): "+intSoda+"\n" +
            "Total Cost: $"+totalCost+"");
        }
        else if(e.getSource() == btnResetOrder){
            
            nbrBurger.setText("0");
            nbrFries.setText("0");
            nbrSoda.setText("0");
            
            cmbBurger.setSelectedIndex(0);
            cmbFries.setSelectedIndex(0);
            cmbSoda.setSelectedIndex(0);
            
            txaOrder.setText("");
          
        }
        
        
    }
    
    private double calculateCost(int count, String size){
        double price = 0.0;
        switch(size){
            case "Small" -> price = 5.00;
            case "Medium" -> price = 7.50;
            case "Large" -> price = 10.00;
        }
        return count*price;
    }
   
    
}
