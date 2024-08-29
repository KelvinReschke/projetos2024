//10) Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas 3 verificações
//e a média dos exercícios que fazem parte da avaliação, e calcule a média de aproveitamento, usando a fórmula:
//MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
//A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever o número do aluno, suas notas, a
//média dos exercícios, a média de aproveitamento, o conceito correspondente e a mensagem 'Aprovado' se o
//conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.
//Média de aproveitamento Conceito
//A. >= 90
//B. >= 75 e < 90
//C.c
//D. >= 40 e < 60
//E. < 4
package desvioscondicionais.atividadesdesvios;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class ex10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe a nota do primeiro trimestre");
        double nota1 = entrada.nextDouble();
        System.out.println("informe a nota do segundo trimestre");
        double nota2 = entrada.nextDouble();
        System.out.println("informe a nota do terceiro trimestre");
        double nota3 = entrada.nextDouble();
        System.out.println("informe a nota dos médias dos exercícios");
        double me = entrada.nextDouble();
        double MA = (nota1 + nota2 * 2 + nota3 * 3 + me) / 7;
        if (MA >= 90) {
            System.out.println("você está aprovado");
        } else if (MA >= 75 && MA < 90) {
            System.out.println("você está aprovado");
        } else if (MA >= 60 && MA < 75) {
            System.out.println("você está aprovado");
        } else if (MA >= 40 && MA < 60) {
            System.out.println("você está reprovado");
        } else if (MA < 40) {
            System.out.println("você está reprovad0");
        }
    }
}
