/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enteros;

/**
 *
 * @author regen
 */
import java.util.Scanner;
public class enteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int a=0, numero;
     Scanner s= new Scanner(System.in);
     System.out.println("Introduzca un número entero: ");
     numero= s.nextInt();
     
     while(a<=numero)
     {
         System.out.println(a);
         a++;
     }
    }
    
}
