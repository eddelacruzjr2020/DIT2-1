/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class TimeWEncapsulation {
    
    private int hours;
    private int minutes;
    private int seconds;
    
    TimeWEncapsulation(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    //Setter and Getter methods
    public void setHours(int hours){
        this.hours = hours;
    }
    
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    
    public void setSeconds(int seconds){
        this.seconds = seconds;
    }
    
    public int getHours(){
        return hours;
    }
    
    public int getMinutes(){
        return minutes;
    }
    
    public int getSeconds(){
        return seconds;
    }
    
    public void displayTime(){
        System.out.println(hours+":"+minutes+":"+seconds);
    }
}
