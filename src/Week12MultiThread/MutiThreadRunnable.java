/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12MultiThread;

import java.lang.System.Logger;
import java.util.logging.Level;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MutiThreadRunnable implements Runnable {
    
    private int numThread;
    
    MutiThreadRunnable(int numThread){
        this.numThread = numThread;
    }
    

    @Override
    public void run() {
        for(int i = 1; i<=5; i++){
          System.out.println(i+" of number thread "+numThread);
          try {
              Thread.sleep(1000);
          } catch (InterruptedException ex) {
              
          }
      }  
    }
    
}
