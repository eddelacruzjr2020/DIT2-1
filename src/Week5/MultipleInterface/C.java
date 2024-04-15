/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.MultipleInterface;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class C implements A, B{
    
    @Override
    public void displayingA(){
        System.out.println("Displaying A");
    }
    
    @Override
    public void displayingB(){
        System.out.println("Displaying B");
    }
   
    public void displayingC(){
        System.out.println("Displaying C");
    }
    
}
