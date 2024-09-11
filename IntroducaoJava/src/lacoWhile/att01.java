/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoWhile;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class att01 {
     public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         System.out.println("informe o valor da material radioativo em gramas");
         double massa = entrada.nextDouble();
         double massainicial = massa;
         int tempo =0;
         while (massa > 0.5 ) {
            massa = massa / 2;
         tempo +=50;}
         System.out.println("massa inicial; "+massainicial);
        System.out.println("massa final; "+ massa);
          System.out.println("horas; "+tempo / 3600 );
        System.out.println("minutos; "+ tempo % 3600 / 60);
         System.out.println("segundos; "+tempo % 60 );
        
         }
}
