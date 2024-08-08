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
public class Exercício03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cálculo da idade em dias");
        System.out.println("informe a sua idade");
        int anos = entrada.nextInt();
        System.out.println("informe os meses");
        int meses = entrada.nextInt();
        System.out.println("informe os dias");
        int dias = entrada.nextInt();
        System.out.println(anos * 365 + meses * 30 + dias);
        
    }
}
