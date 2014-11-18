
package boletin95;

import java.util.Scanner;


public class Boletin95 {

    
    public static void main(String[] args) {
        
        String opcion;
        Serie met=new Serie();
        Scanner dat=new Scanner(System.in);
        
        System.out.println("****MENU****");
        System.out.println(" escoje a, b, c");
        System.out.println(":");
        
        opcion=dat.nextLine();
        
        System.out.println("cantidad de numeros");
        met.cantNumeros();
        
        
        switch (opcion){
            case "a":met.Serie1();
                break;
            case "b":met.serie2();
                break;
            case "c":met.serie3();
                break;
        }
    
    }
    
}
