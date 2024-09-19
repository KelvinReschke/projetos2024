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
public class att02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int[] valores = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("informe o valor " + i + " : ");
            valores[i] = entrada.nextInt();

        }
        int QuantidadeNegaivos = 0;
        for (int i = 0; i < 10; i++) {
            if (valores[i] < 0) {
                QuantidadeNegaivos++;
            }
        }
        System.out.println("soma " + QuantidadeNegaivos);

    }
}
