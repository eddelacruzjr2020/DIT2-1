/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Person;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Person implements Comparable<Person>{
    
    private String studentName;
    private int studentGrade;
    
    Person(String studentName, int studentGrade){
        this.studentName=studentName;
        this.studentGrade=studentGrade;
    }
    
    public String getStudentName(){
        return studentName;
    }
        
    public int getStudentGrade(){
        return studentGrade;
    }
    

    @Override
    public int compareTo(Person o) {
        return this.studentGrade - o.studentGrade;
    }
    
}
