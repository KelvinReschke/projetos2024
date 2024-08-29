/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchCase;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class att02 {
     public static void main(String[] args) {
                 Scanner entrada = new Scanner(System.in);
                 System.out.println("identifica o dia da semana");
                 System.out.println("informe um número de 1 a 7");
                 int dia = entrada.nextInt();
                 switch(dia){
                     case 1:
                         System.out.println("Domingo");
                         break;
                         
                     case 2:
                         System.out.println("Segunda");
                         break; 
                         
                     case 3:
                         System.out.println("Terça-Feira");
                         break;
                         
                     case 4:
                         System.out.println("Quarta-Feira");
                         break;
                         
                     case 5:
                         System.out.println("Quinta-Feira");
                         break;
                                 
                     case 6:
                         System.out.println("Sexta-Feira");
                         break;
                         
                     case 7:
                         System.out.println("Sábado");
                         break;
                     default :
                         System.out.println("dia inválido");
                         break;
                 }
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
}}
