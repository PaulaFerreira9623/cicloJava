/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

/**
 *
 * @author regen
 */
import java.util.Scanner;
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int cantidad=0;  //variable que almacena la cantidad de numeros ingresados
    double total=0,promedio,valor;
    do{ 
        /* En el do se pide al usuario el ingreso del numero y se almacena
        esta en la varivale valor*/
    Scanner s= new Scanner(System.in);
    System.out.println("Ingrese un numero-presione 0 para terminar: " );
    valor=s.nextDouble();
    /*Se incluye un if que valida si el valor es diferente de 0 y si lo es, realiza
    la sumatoria e incrementa la cantidad*/
    if(valor!=0){
            total=total+valor;
            cantidad++;
    }} while(valor!=0);  /*En el while se indica que todo lo anterior
    se realiza, unicamente mientras el valor sea diferente de cero*/
    
    if(cantidad!=0){
    // se calcula el promedio y se muestra en pantalla
    promedio= total/cantidad;
    System.out.println(" El promedio es: ");
    System.out.println(promedio);
    }
    else{ // con el else, si la cantidad de números fue cero, se muestra el mensaje:
    System.out.println("No se realizó el ingreso de ningún valor");
    }
    }}


