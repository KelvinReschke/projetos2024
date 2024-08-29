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
public class att01 {
 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     System.out.println("calculadora...  ");
     System.out.println("informe o valor 1");
     double valor1  = entrada.nextDouble();
     System.out.println("Informe a operação; ");
     String operacao  = entrada.next();
     System.out.println("informe o valor 2 ");
     double valor2 = entrada.nextDouble();
     
     switch(operacao){
         case "+":
             System.out.println("resultado = " + (valor1 + valor2));
         break;
         
         case "-":
              System.out.println("resultado = " + (valor1 - valor2));
         break;      
         
          case "*":
             System.out.println("resultado = " + (valor1 * valor2));
         break;
         
         case "/":
              System.out.println("resultado = " + (valor1 / valor2));
         break;     
         default:
             System.out.println("operação invalida: ");
             break;
     }
        
        
        
 }}