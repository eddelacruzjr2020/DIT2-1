/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class RetunValue {
    
    int x, y, z, sum, age;
    String fName, lName;
    
    public int addition(int x, int y, int z){
        sum = x+y+z;
        return sum;
    }
    
    public String getFullNameAndAge(String fName, String lName, int age){
        String details = fName+" "+lName+" Your age is "+age;
        return details;
    }
}
