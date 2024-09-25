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
public class att05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A[] = new int[5];
        int B[] = new int[5];
        int C[] = new int[5];
        int resultado = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("informe 5 valores para A: ");
            A[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("informe 5 valores para B: ");
            B[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] * B[i];
            System.out.println(A + " * " + B + " = "  + C[i] );
        }
    }
}
