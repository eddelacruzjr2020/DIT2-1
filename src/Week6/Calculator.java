/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Calculator {
    
    private int firstInt, secondInt, sumInt;
    private double FirstDou, secondDou, sumDou;
    private String firstString, secondString, concatenate;
    
    public void add(int firstInt, int secondInt){
        sumInt = firstInt+secondInt;
        System.out.println("This sum of 2 Integer is "+sumInt);
    }
    
    public int add(){
        return 0;
    }
    
    public void add(double FirstDou, double secondDou){
        sumDou = FirstDou+secondDou;
        System.out.println("This sum of 2 Double is "+sumDou);
    }
    
    public void add(String firstString, String secondString){
        concatenate = firstString+" "+secondString;
        System.out.println("This concatenate of 2 String is "+concatenate);
    }
    
}
