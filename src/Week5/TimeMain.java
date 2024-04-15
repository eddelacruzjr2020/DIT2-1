/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week5;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class TimeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TimeWOEncapsulation time = new TimeWOEncapsulation();
        time.setHours(12);
        time.setMinutes(30);
        time.setSeconds(45);
        time.displayTime();

        TimeWEncapsulation time1 = new TimeWEncapsulation(12, 30, 30);
        time1.displayTime();
        
    }
    
    
}
