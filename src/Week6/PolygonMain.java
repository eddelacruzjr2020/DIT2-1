/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week6;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class PolygonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rec = new Rectangle(10.0, 9.5);
        System.out.println("Area of Rectangle is "+rec.calculateArea());
        
        Triangle tri = new Triangle(9.69, 5.10);
        System.out.println("Area of Triangle is "+tri.calculateArea());
    }
    
}
