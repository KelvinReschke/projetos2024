/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desvioscondicionais.Dowhile;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class att03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("JOGO DA SENHA!!! "
                + "foi sorteado um número,adivinhe!");
        int ValorSorteado = aleatorio.nextInt(100) + 1;

        int ValorChutado = 0;
        int cont = 0;
        do {
            cont++;
            System.out.println("Informe um Valor entre 1 e 100 +3"
                    + ""
                    + ":  ");
            ValorChutado = entrada.nextInt();
            if (ValorChutado < ValorSorteado) {
                System.out.println("Você errou,tente um número maior! ");
                System.out.println("O número chutado é menor que o valor sorteado");
            } else if (ValorChutado > ValorSorteado) {
                System.out.println("Você errou,informe um valor menor! ");
                System.out.println("O número chutado é maior que o valor sorteado");

            }
        } while (ValorSorteado != ValorChutado);
        System.out.println("você acertou em  " + cont + " chutes");
        System.out.println("");
         if (cont <3 )
             System.out.println("PARABÉNS VOCÊ FOI MUITO BEMM!!!");
         else if (cont > 5)
             System.out.println("você é burro,mas está na da média dos Brasileiros ");
         else {
             System.out.println("você pode melhorar ");
         }
    }
}
