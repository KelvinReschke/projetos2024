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
public class Exercício04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos informar o total de votos Brancos,Nulos e votos validos");
        System.out.println("número total de votos");
        int total = entrada.nextInt();
        System.out.println("número de votos brancos");
        int brancos = entrada.nextInt();
        System.out.println("número de votos nulos");
        int nulos = entrada.nextInt();
        System.out.println("informe o total de votos validados");
        int validos = entrada.nextInt();
        System.out.println("brancos -" +(brancos * 100 / total) + "%");
        
    }
}
