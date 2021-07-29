/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

/**
 *
 * @author regen
 */
import java.util.Scanner;
public class notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cant1=0,cant2=0;
       double nota;
       Scanner s= new Scanner(System.in);
       
       do{
       System.out.println("Por favor ingrese las notas del estudiante-digite 0 para salir: ");
       nota=s.nextDouble();
       if(nota>=6){
             cant1++;
       } else if(nota>0) {
          cant2++;
       }
       } while(nota!=0);
    System.out.println("Los estudiantes con nota mayor o igual a 6 son: "+cant1);
    System.out.println("Los estudiantes con nota menor a 6 son: "+cant2);
    
       
       
    }
    
}
