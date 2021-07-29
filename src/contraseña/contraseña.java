/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contraseña;

/**
 *
 * @author regen
 */
import java.util.Scanner;
public class contraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int contraseña;
       Scanner s= new Scanner(System.in);
       do{
       
       System.out.println("Por favor, ingrese la contraseña de acceso: ");
       contraseña=s.nextInt();
       }  while(contraseña!=9623);
       if(contraseña==9623){
       System.out.println("Bienvenido al sistema");
    }
}}
