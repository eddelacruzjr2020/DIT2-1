/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Week11.DefaultInterface;

/**
 *
 * @author Edmundo Dela Cruz
 */
public interface Interfac {
    
    public void method1();
    public void method2();
    default void method3(){
        System.out.println("Method 3");
    }
    
    
}
