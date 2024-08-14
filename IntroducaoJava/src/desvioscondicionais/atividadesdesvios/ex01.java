//1) Escreva um algoritmo que receba a idade e o nome da pessoa e indique se ela é criança (0 a 15 anos), adulta
//(15 a 60 anos) ou idosa (maior de 60)
 
package desvioscondicionais.atividadesdesvios;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class ex01 {
            
public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
    System.out.println("exercício para descobri se vc é idoso,adulto ou uma criança");
    System.out.println("informe o seu nome");
    String nome = entrada.nextLine();
    System.out.println("informe a sua idade");
    int idade = entrada.nextInt();
    if(idade<15) {
        System.out.println(nome +" você é uma criança");
       
    }
    if ((idade >= 15) && (idade < 60)){
        System.out.println(nome +" você é um adulto");
    }
         if(idade >60){
             System.out.println(nome + " você é um idoso");
         }  
    




}}




