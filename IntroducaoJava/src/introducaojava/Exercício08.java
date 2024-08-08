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
public class Exercício08 {
    
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        System.out.println("vamos calcular o valor de esponenciação");
        System.out.println("informe a base");
         double base = entrada.nextDouble();
        System.out.println(" informe o valor do expoente");
         double expoente = entrada.nextDouble();
        System.out.println("resultado; = "+Math.pow(base, expoente));    
    }

  

    
        
    }

