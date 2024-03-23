/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dit2.pkg1;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class ClassLevelScope {
    
    public String name;
    private int age;
    protected double grade;
    String subject;
    
    public void getStudentRecord(String name, int age, double grade, String subject){
        System.out.println("Name: "+name+" Age: "+age+" Grade: "+grade+" Subject: "+subject);
        
    }
    
    
}
