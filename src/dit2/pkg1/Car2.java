/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dit2.pkg1;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Car2 {
    public void changeTires() {
        int numTires = 4;
        int changedTires = 0;
        int i;
        for (i = 0; i < numTires; i++) {
            changedTires += 1;
        }
        
        System.out.println(numTires);
        System.out.println(changedTires);
        System.out.println(i);
        // numTires and changedTires are accessible here, i is not
    }

}
