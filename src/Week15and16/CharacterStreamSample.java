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
public class CharacterStreamSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        FileReader readStream = null;
        FileWriter writerStream = null;
        
        try{
            readStream = new FileReader("input.txt");
            writerStream = new FileWriter("output.txt");
            
            int c;
            while((c = readStream.read()) !=-1){
                writerStream.write(c);
            }
            
        }finally{
            if(readStream != null){
                readStream.close();
            }
            
                if(writerStream != null){
                writerStream.close();
            }
            
        }
    }
    
}
