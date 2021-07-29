/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author regen
 */
public class fibonacci {
    public static void main(String []args){
    int num_uno=0;
    int num_dos=1;
    
    System.out.println("Serie de Fibonacci");
    while(num_dos<=1597){
    System.out.println(num_uno);
    System.out.println(num_dos);
    num_uno+=num_dos;
    num_dos+=num_uno;
    }
    
           
    
    
    
    
    
    
    }
}
