//Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. 
//Depois modifique o programa para que ele mostre os números um ao lado do outro.
package laco_for;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class att02 {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i += 1) {
            System.out.print(i + "  ");
        }
        System.out.println("");
        for (int i = 1; i <= 20; i += 1) {
            System.out.println(i + "  ");
        }
    }
}
