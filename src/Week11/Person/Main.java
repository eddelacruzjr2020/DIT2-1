/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week11.Person;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person1 = new Person("Ed", 100);
        Person person2 = new Person("Princess", 100);
        
        int resultsGrade = person1.compareTo(person2);
        
        if(resultsGrade > 0 ){
            System.out.println(person1.getStudentName()+" smarter than "+person2.getStudentName());
        }else if(resultsGrade < 0 ){
            System.out.println(person2.getStudentName()+" smarter than "+person1.getStudentName());
        }else{
            System.out.println(person2.getStudentName()+" and "+person1.getStudentName()+" are both smart");
        }
    }
    
}
