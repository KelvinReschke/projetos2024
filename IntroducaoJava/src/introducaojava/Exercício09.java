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
public class Exercício09 {
    public static void main(String[] args) {
                 Scanner entrada = new Scanner(System.in);

        System.out.println("calculo de radiciação");
        System.out.println("informe o valor que deseja extrair a raiz");
          double valor = entrada.nextDouble();
          double resultado = Math.sqrt(valor);
        System.out.println("valor da raiz de "+ valor + "é:" + resultado );
               
    }
            
}
