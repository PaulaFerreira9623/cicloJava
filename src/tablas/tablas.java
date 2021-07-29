/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author regen
 */
import java.util.Scanner;
public class tablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int numero,tabla;
      Scanner s= new Scanner(System.in);
      System.out.println("Por favor ingrese el número del que desea obtener la tabla de multiplicar: ");
      numero= s.nextInt();
      System.out.println("Tabla de multiplicar del: "+numero);
      while(numero<0){
      System.out.println("Por favor ingrese un número positivo: ");
      numero= s.nextInt();
      }
      for(int i=1; i<=10;i++){
          tabla=i*numero;
      System.out.println(+numero+ "X"+i+ "="+tabla);
      }
      
    }
    
}
