/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esferaarea;

/**
 *
 * @author regen
 */
import java.util.Scanner;
public class esferaarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double area, radio;
       Scanner s= new Scanner(System.in);
       System.out.println("Por favor, ingrese el valor del radio: ");
       radio=s.nextDouble();
       while(radio<=0) 
       {
       System.out.println("Por favor, ingrese un valor positivo o mayor que cero para el radio: ");
       radio=s.nextDouble();
       }
       area= 4*Math.PI*Math.pow(radio,2);
       System.out.println("El área de la esfera es: "+area);
       
       
       
       area= 4*Math.PI*Math.pow(radio,2);
    }
    
}
