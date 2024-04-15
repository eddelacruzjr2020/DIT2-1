/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.Hybrid;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class D implements B, C{
    
    @Override
    public void displayingA(){
        System.out.println("Displaying A");
    }
    
    @Override
    public void displayingB(){
        System.out.println("Displaying B");
    }
        
    @Override
    public void displayingC(){
        System.out.println("Displaying C");
    }
        
    
    public void displayingD(){
        System.out.println("Displaying D");
    }
    
}
