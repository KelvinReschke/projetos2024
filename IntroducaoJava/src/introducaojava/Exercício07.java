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
public class Exercício07 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos descobrir a média final do aluno");
        System.out.println("escreva a baixo a nota do primeiro trimestre");
        int primeiro = entrada.nextInt();
        System.out.println("escreva a baixo a nota do segundo trimestre");
        int segundo = entrada.nextInt();
        System.out.println("escreva a baixo a nota do terceiro trimestre");
        int terceiro = entrada.nextInt();
        System.out.println("média final do aluno"  + primeiro *2 + segundo *3 + terceiro *5 / 10);
        int média = entrada.nextInt();
        
        
    }
}