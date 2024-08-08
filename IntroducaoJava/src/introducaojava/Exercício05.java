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
public class Exercício05 {
     public static void main(String[] args) {
        

    Scanner entrada = new Scanner(System.in);
        System.out.println("algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.");
        System.out.println(" informe o Salário atual do funcionario");
        double salarioAtual = entrada.nextDouble();
        System.out.println("informe a % de reajuste");
        double reajuste = entrada.nextDouble();
         System.out.println( reajuste / 100 *salarioAtual + salarioAtual);
                
}
}
