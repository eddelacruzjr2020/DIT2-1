/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class TimeWOEncapsulation {
    
    int hours;
    int minutes;
    int seconds;
    
    //Setter methods
    public void setHours(int hours){
        this.hours = hours;
    }
    
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    
    public void setSeconds(int seconds){
        this.seconds = seconds;
    }
    
    public void displayTime(){
        System.out.println(hours+":"+minutes+":"+seconds);
    }
}
