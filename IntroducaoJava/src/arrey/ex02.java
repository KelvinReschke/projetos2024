/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class ex02 {

    public static void main(String[] args) {
        int[] idade = new int[10000];
        Random aleatorio = new Random();
        for (int i = 0; i < 10000; i++) {
            idade[i] = aleatorio.nextInt(101);
        }
//mostre quantas pessoas tem mais de 60 anos
        int PessoasComMaisde60 = 0;
        for (int i = 0; i < 10000; i++) {
            if (idade[i] > 60) {
                PessoasComMaisde60++;

            }
        }
        System.out.println("Total de pessoas com 60+: " + PessoasComMaisde60);

        //mostre a idade da pessoa mais velha 
        int PessoaMaisVelha = 0;
        for (int i = 0; i < 10000; i++) {
            if (idade[i] > PessoaMaisVelha) {
                PessoaMaisVelha = idade[i];
            }
        }
        System.out.println("A pessoa mais velha tem: " +PessoaMaisVelha +" anos");
         
        //Quantidade de de menores
        int Dmenores = 0;
        for (int i = 0; i < 10000; i++) {
            if (idade[i] < 18 ) {
                Dmenores++;

            }
        }
        System.out.println("Quantidade de Dmenores: " + Dmenores);

        //Média de idade de todas as pessoas
        double totalIdades = 0;
        for (int i = 0; i < 10000; i++) {
            totalIdades = totalIdades + idade[i];
        }
        System.out.println("Média de idades " +(totalIdades/10000));
    }
}
