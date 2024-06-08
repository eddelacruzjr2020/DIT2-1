/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13CollectionAPI;
import java.util.*;
/**
 *
 * @author Edmundo Dela Cruz
 */
public class Shuffling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] number = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        List<Integer> numbers = Arrays.asList(number);
        Collections.shuffle(numbers);
        
        numbers.toArray(number);
        
        System.out.println(Arrays.toString(number));
        
      
    }
    
}
