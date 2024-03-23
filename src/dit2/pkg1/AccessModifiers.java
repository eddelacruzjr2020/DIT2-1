/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dit2.pkg1;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class AccessModifiers {
    
    public void publicMethod(){
        System.out.println("Public Method");
    }
    
    void defaultMethod(){
        System.out.println("Default Method");
    }
    
    protected void protectedMethod(){
        System.out.println("Protected Method");
    }
    
    private void privateMethod(){
        System.out.println("Private Method");
    }
    
//    public static void main(String[] args){
//        AccessModifiers am = new AccessModifiers();
//        am.publicMethod();
//        am.privateMethod();
//        am.defaultMethod();
//        am.protectedMethod();
//    }
//    
}
