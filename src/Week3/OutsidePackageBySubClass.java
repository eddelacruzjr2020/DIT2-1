/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class OutsidePackageBySubClass extends dit2.pkg1.AccessModifiers{
   
    public void test(){
        System.out.println("Test");
    }
    
     public static void main(String[] args) {
        OutsidePackageBySubClass ops = new OutsidePackageBySubClass();
        ops.publicMethod();
        ops.protectedMethod();
    
        
    }
    
}
