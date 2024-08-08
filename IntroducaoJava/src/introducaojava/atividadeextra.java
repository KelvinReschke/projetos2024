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
public class atividadeextra {
      public static void main(String[] args) {
                 Scanner entrada = new Scanner(System.in);
                 System.out.println("conversão de fahrenheit em graus celsius");
                 System.out.println("informe o valor de fahrenheit");
                 double fahrenheit = entrada.nextDouble();
                 System.out.println("o valor em celsius é:" + (fahrenheit-32) * (5/9.0));
}}
