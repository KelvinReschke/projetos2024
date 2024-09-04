//Faça um programa que leia 5 números e informe a soma e a média dos números.
package laco_for;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class att4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe um valor 1");
        int valor = entrada.nextInt();
        for (int i = 1; i <= 5; i++) {
            System.out.println("informe um valor i");
            valor = (int) (valor + entrada.nextDouble());
            System.out.println("média = " + valor / 5);
            System.out.println("soma = " + valor);

        }}

    }

