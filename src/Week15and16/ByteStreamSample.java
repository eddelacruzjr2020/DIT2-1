/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week15and16;
import java.io.*;
/**
 *
 * @author Edmundo Dela Cruz
 */
public class ByteStreamSample {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try{
            in = new FileInputStream("C:\\Users\\Edmundo Dela Cruz\\Desktop\\source.txt");
            out = new FileOutputStream("C:\\Users\\Edmundo Dela Cruz\\Desktop\\School Related\\SY2324 2nd Semester\\Sat 730AM-1230PM OOP BSIT 2-1\\target.txt");
            
            int c;
            while((c=in.read()) !=-1){
                out.write(c);
            }
            
        }finally{
            
            if(in!=null){
                in.close();
            }

            if(out!=null){
                in.close();
            }
        }
    }
    
}
