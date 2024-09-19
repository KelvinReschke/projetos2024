/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desvioscondicionais.Dowhile;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class ex01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String candidato1 = "Lula";
        String candidato2 = "Bolsonaro";
        String candidato3 = "Tiradentes";
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        String opcao = "";
        int nulos = 0;
        do {
            System.out.println("CÂNDIDATOS; ");
            System.out.println("1 - Lula");
            System.out.println("2 - Bolsonaro");
            System.out.println("3 - Tiradentes");
            System.out.println("ESCOLHA O SEU CÂNDIDATO:  ");
            int voto = entrada.nextInt();
            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                default:
                    nulos++;
                    break;
            }
            System.out.println("tem mais eleitores? "
                    + "\nS - Sim: "
                    + "\nN - Não: ");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase("S"));
        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            System.out.println(candidato1 + " FOI O VENCEDOR");
        }
        if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            System.out.println(candidato2 + " FOI O VENCEDOR");
        }
        if (votosCandidato3 > votosCandidato2 && votosCandidato3 > votosCandidato1) {
            System.out.println(candidato3 + " FOI O VENCEDOR");
        }

        System.out.println(candidato1 + ": " + votosCandidato1);
        System.out.println(candidato2 + ": " + votosCandidato2);
        System.out.println(candidato3 + ": " + votosCandidato3);

    }
}
