
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
public class exercício12 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.println("algoritimo para contagem de dinheiro");
         System.out.println("informe quantas notas de 2 vc tem");
         int notasde2 = entrada.nextInt();
         System.out.println("informe quantas notas de 5 vc tem");
         int notasde5 = entrada.nextInt();
         System.out.println("informe quantas notas de 10 vc tem");
         int notasde10 = entrada.nextInt();
         System.out.println("informe quantas notas de 20 vc tem");
         int notasde20 = entrada.nextInt();
         System.out.println("informe quantas notas de 50 vc tem");
         int notasde50 = entrada.nextInt();
         System.out.println("informe quantas notas de 100 vc tem");
         int notasde100 = entrada.nextInt();
         System.out.println("informe quantas notas de 200 vc tem");
         int notasde200 = entrada.nextInt();
         System.out.println(notasde2 * 2 + notasde5 *5 + notasde10 * 10 + notasde20 * 20 + notasde50 * 50 + notasde100 * 100 + notasde200 * 200);
         
}}
