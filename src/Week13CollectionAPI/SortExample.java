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
public class SortExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> list = new ArrayList<String>();
        list.add("banana");
        list.add("apple");
        list.add("watermelon");
        
        System.out.println("Current list order is:\n"+list);
        
        Collections.sort(list);
        System.out.println("Current list order is:\n"+list);
        
        list.sort(null);
        System.out.println("Current list order is:\n"+list);
    }
    
}
