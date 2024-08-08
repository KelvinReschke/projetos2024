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
public class Exercício10 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        System.out.println("insira o comprimento da parede 1");
        double parede1 = entrada.nextDouble();
        System.out.println("insira o comprimento da parede 2");
        double parede2 = entrada.nextDouble();
        System.out.println("o comprimento de 'H' deve ser" + Math.sqrt (Math.pow (parede1,2) + ( Math.pow (parede2,2))));
    }
}
