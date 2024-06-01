/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week12MultiThread;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MultiThreadRunnableMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1; i<=5; i++){
            MutiThreadRunnable runnable = new MutiThreadRunnable(i);
            Thread myThread = new Thread(runnable);
            myThread.start();
            
        }
    }
    
}
