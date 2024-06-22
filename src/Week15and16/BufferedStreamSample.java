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
public class BufferedStreamSample {


    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        String[] names = {"John", "Paul", "Awra"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("dit21.txt"));
            writer.write("Writing to a file");
            writer.write("\nHere new agendas");
            
            for(String name: names){
                writer.write("\n" +name);
            }
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("dit21.txt"));
            
            //System.out.println(reader.readLine());
            
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);  
   
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
    
}

