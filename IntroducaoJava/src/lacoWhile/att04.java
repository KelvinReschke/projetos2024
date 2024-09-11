/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoWhile;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class att04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o seu código");
        int codigo1 =0;
        double pessoaMaisA = 0;
        int pesoA = 0;

        int codigo2 =0;
        double pessoaMaisB = 0;
        int pesoB = 0;

        int codigo3 =0;
        double pessoaMaisG = 0;
        int pesoG = 0;

        int codigo4 =0;
        double pessoaMaisM = 0;
        int pesoM = 0;
       
        
        ;
        int pesoTotal =0 ;
        int alturaTotal =0;
        int cod = -1;
        int cont = 0;
        while (cod != 0) {
            System.out.println("informe seu código de cliente");
            int codigo = entrada.nextInt();
            System.out.println("informe o seu peso");
            double peso = entrada.nextDouble();
            System.out.println("informe a sua altura");
            double altura = entrada.nextDouble();
            if (altura > pessoaMaisA) {
                codigo1 = codigo;
                pessoaMaisA = altura;
                pessoaMaisA = peso;

            }
            if (altura < pessoaMaisB) {
                codigo2 = codigo;
                pessoaMaisB = altura;
                pessoaMaisB = peso;
            }


            if (altura > pessoaMaisG) {
                codigo3 = codigo;
                pessoaMaisG = altura;
                pessoaMaisG = peso;

            }
            if (altura < pessoaMaisM) {
                codigo4 = codigo;
                pessoaMaisM = altura;
                pessoaMaisM = peso;

            }

          pesoTotal += peso;
         alturaTotal += altura;
             cont++;
             System.out.println("opções; "
                     + "\n0 - para sair"
                     + "\n1 para um novo cadastro");
             cod = entrada.nextInt();
                     }
        
          System.out.println("Pessoa mais alta\n"
                + "Código: " + codigo1 + "\n"
                + "Altura: " + pessoaMaisA + "\n"
                + "Peso: " + pesoA);
        System.out.println("Pessoa mais baixa\n"
                + "Código: " + codigo2 +"\n"
                + "Altura: " + pessoaMaisB + "\n"
                + "Peso: " + pesoB);
        System.out.println("Pessoa mais obesa\n"
                + "Código: " + codigo3 + "\n"
                + "Altura: " + pessoaMaisG + "\n"
                + "Peso: " + pesoG);
        System.out.println("Pessoa mais magra\n"
                + "Código: " + codigo4 + "\n"
                + "Altura: " + pessoaMaisM + "\n"
                + "Peso: " + pesoM);


        
        
    }
}
