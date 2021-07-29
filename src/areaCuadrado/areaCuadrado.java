/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaCuadrado;

/**
 *
 * @author regen
 */
import java.util.Scanner;
public class areaCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int contador= 0;
       double lado,area;
       Scanner s= new Scanner(System.in);
       System.out.println("Por favor ingrese la medida del lado del cuadrado en cm: ");
       lado= s.nextDouble();
       
       while(lado>0)
       {  area= lado*lado;
          System.out.println("El área del cuadrado es: "+area);
          contador++;
          System.out.println("Por favor ingrese la medida del lado del cuadrado en cm: ");
          lado= s.nextDouble();
       }    
       System.out.println("Se ha calculado el área de " +contador+" cuadrados");
    }
    
}
