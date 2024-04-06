/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Canteen {
    
    String rice;
    String ulam1;
    String ulam2;
    String drinks;
    
    Canteen(String ulam1){
        this.ulam1 = ulam1;
    }
    
    Canteen(String rice, String ulam1){
        this.rice = rice;
        this.ulam1 = ulam1;
    }
    
    Canteen(String rice, String ulam1, String ulam2){
        this.rice = rice;
        this.ulam1 = ulam1;
        this.ulam2 = ulam2;
    }
    
    Canteen(String rice, String ulam1, String ulam2, String drinks){
        this.rice = rice;
        this.ulam1 = ulam1;
        this.ulam2 = ulam2;
        this.drinks = drinks;
    }
    
    public void canteenOrder(int studentNumber){
        System.out.println("Student "+studentNumber+" Your order is/are Ulam1: "+ulam1+"\nRice: "+rice+"\nUlam2: "+ulam2+"\nDrinks: "+drinks);
    }
    
}
