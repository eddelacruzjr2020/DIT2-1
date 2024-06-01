/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week12MultiThread;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MultiThreadExtendMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1; i<=5; i++){
            MultiThreadExtend multithread = new MultiThreadExtend(i);
            //New State
            multithread.start();
            //Runnable State 
            //Once Thread is pick-up --> Running (Given that has CPU Processor available)
            //Running --> Blocked (if new high priority enter)
            //Blocked --> Running (if available CPU processor)
        }
        
        
    }
    
}
