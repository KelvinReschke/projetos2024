/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desvioscondicionais.atividadesdesvios;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class ex09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira o valor da compra");
        double valor = entrada.nextDouble();
        System.out.println("escolha uma forma de pagamento"
                + "\n Digite 1 - Cheque"
                + "\n Digite 2 - cartão"
                + "\n Digite 3 - para parcelar em 2x"
                + "\n Digite 4 - para parcelar em 10x");
        String mp = entrada.next();
        if (mp.equalsIgnoreCase("1")) {
            System.out.println("Total a pagar: " + (valor * 0.9));
        } else if (mp.equalsIgnoreCase("2")) {
            System.out.println("Total a pagar: " + (valor * 0.85));
        } else if (mp.equalsIgnoreCase("3")) {
            System.out.println("Total a pagar: " + (valor));
        } else if (mp.equalsIgnoreCase("4")) {
            System.out.println("Total a pagar: " + (valor * 1.1));
        } else {
            System.out.println("forma de pagamento invalido");
        }
    }
}
