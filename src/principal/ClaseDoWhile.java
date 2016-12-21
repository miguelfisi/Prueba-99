/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class ClaseDoWhile {

  
    public static void main(String[] args) {
     String nombre;
       
                  
     do{
          Scanner scanner= new Scanner (System.in);
        System.out.println("Ingrese su nombre");  
        nombre=scanner.nextLine();
      System.out.println("Eres bienvenido siempre"+nombre);
      
      }while(!(nombre.equals("luis")||nombre.equals("Luis")));
     System.out.println("Me acaban de confirmar que eres bienvenido solo una ves, chau"+nombre);
    }
}
