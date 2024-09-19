/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrey;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class att01 {

 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    int[] valores = new int [5];
    int soma = 0 ;
     for (int i = 0; i < 5; i++) {
         System.out.println("informe um valor " + (i+1+ " : "));
         valores[i] = entrada.nextInt();
     }
    
     for (int i = 0; i < 5 ; i++) {
         soma += valores[i];
     }
     System.out.println("Soma: "+soma);

        
    

}}