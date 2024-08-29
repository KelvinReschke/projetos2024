//Faça um algoritmo que leia uma variável e some 5, caso seja par ou some 8, caso seja ímpar, imprimir o
//resultado desta operação.
package desvioscondicionais.atividadesdesvios;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class ex05 {
  public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);   
      System.out.println("informe um valor");
      int valor = entrada.nextInt();
      if (valor %2==0){
          System.out.println("Resultado: "+ (valor + 5));
      }else{
                  System.out.println("Resultado: "+(valor + 8));
                  
                  }
      }
  
  
  
  
  }
