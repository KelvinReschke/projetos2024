//
//8) O IMC – Indice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação
//sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / (altura)². Elabore um algoritmo que
//leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo.
//IMC EM ADULTOS CONDIÇÃO
//Abaixo de 18,5 Abaixo do peso
//Entre 18,5 e 25 Peso normal
//Entre 25 e 30 Acima do peso
//Acima de 30 Obeso
package desvioscondicionais.atividadesdesvios;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class ex08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o seu peso");
        double peso = entrada.nextDouble();
        System.out.println("informe a sua altura");
        double altura = entrada.nextDouble();
        double re = peso / Math.pow(altura, 2);
        System.out.println (""+re);
        if(re<18.5)
        System.out.println(" abaixo do peso ");
        else if(re<25)
        System.out.println(" Peso normal");
        else if(re<30)
        System.out.println("acima do peso");
        else 
        System.out.println("Você é considerado Obeso");
       

    }

}
