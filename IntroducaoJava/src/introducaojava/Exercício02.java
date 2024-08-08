/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaojava;

import java.util.Scanner;

/**
 *
 * @author kelvi
 */
public class Exercício02 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         System.out.println("Cálculo das dimenções de um retãngulo");
         System.out.println("informe o valor da base");
         int base = entrada.nextInt ();
         System.out.println("informe o valor da altura");
         int altura = entrada.nextInt ();
         System.out.println(base * altura);
         
         
         
    } 
    
}
