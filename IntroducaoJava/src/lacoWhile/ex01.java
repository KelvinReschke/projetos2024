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
public class ex01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe um valor entre 0 e 10");
        double nota = entrada.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("o valor informado não é valido");
            System.out.println("informe um valor entre 0 e 10");
            nota = entrada.nextDouble();
        }
        System.out.println("nota imformada -> " + nota);

    }
}
