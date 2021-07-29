/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author regen
 */
import java.util.Scanner;
public class factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int numero,factorial=1;
       
        Scanner s= new Scanner(System.in);
        System.out.println("Por favor ingrese el número al que desea hallar el factorial: ");
        numero=s.nextInt();
  
        if(numero>0){
            for(int i=numero; i>0; i--){
                factorial=i*factorial;
            }
        System.out.println("El factorial del número es: "+factorial);    
        }
        else 
            System.out.println("El número no tiene factorial");
    }
         
        }
