/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12MultiThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MultiThreadExtend_1 extends Thread{
    
    private int numThread;
    
    MultiThreadExtend_1(int numThread){
        this.numThread = numThread;
    }
    
    @Override
    public void run(){
      for(int i = 1; i<=5; i++){
          System.out.println(i+" of number thread "+numThread);
          try {
              Thread.sleep(1000);
              if(numThread == 3){
                  throw new RuntimeException();
              }
          } catch (InterruptedException ex) {
              Logger.getLogger(MultiThreadExtend_1.class.getName()).log(Level.SEVERE, null, ex);
          }
      }  
    }
}
