/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week4;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class CanteenMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Student 1
        Canteen sO1 = new Canteen("Adobo");
        sO1.canteenOrder(1);
        
        //Student 2
        Canteen sO2 = new Canteen("Brown Rice","Adobo");
        sO2.canteenOrder(2);
        
        //Student 3
        Canteen sO3 = new Canteen("Friend Rice", "Adobo", "Fried Chicken");
        sO3.canteenOrder(3);
        
        //Student 4
        Canteen sO4 = new Canteen("Friend Rice", "Adobo", "Fried Chicken", "Beer");
        sO4.canteenOrder(4);
        
        
    }
    
}
