
package switchCase;

import java.util.Scanner;


// */ Escreva um algoritmo que recebe como entrada o
//ano e o mês. O seu programa deve apresentar a
//quantidade de dias deste mês.
// Obs.: Considere que fevereiro pode ter 29 dias em
//anos bissextos. 

public class att03 {
      public static void main(String[] args) {
        

    Scanner entrada = new Scanner(System.in);
          System.out.println("calendario mensal");
          System.out.println("informe um número de 1 a 12: ");
          int mes = entrada.nextInt();
          System.out.println("informe o ano: ");
          int ano = entrada.nextInt();
          boolean isBissexto = ano % 4 ==0;
          switch (mes){
              case 1:
                  System.out.println("janeiro tem 31 dias");
                  break;
                  
              case 2:
                  if(isBissexto){
                  System.out.println("fevereiro tem 29 dias");
                  }else { 
                      System.out.println("fevereiro tem 28 dias");
                  }
                   break;
                   
              case 3:
                  System.out.println("março tem 31 dias");
                  break;   
               
              case 4:
                  System.out.println("abril tem 30 dias");
                  break;
                   
              case 5:
                  System.out.println("maio tem 31 dias");
                  break;   
               
              case 6:
                  System.out.println("junho tem 30 dias");
                  break;       
                  
              case 7:
                  System.out.println("julho tem 31 dias");
                  break;   
               
              case 8:
                  System.out.println("agosto tem 31 dias");
                  break;  
                   
              case 9:
                  System.out.println("setembro tem 30 dias");
                  break;   
               
              case 10:
                  System.out.println("outubro tem 31 dias");
                  break;     
                  
               case 11:
                  System.out.println("novembro tem 30 dias");
                  break;   
               
              case 12:
                  System.out.println("dezembro tem 31 dias");
                  break;     
                      
                  
                  
                  
                  
                  
                  
                  
                  
          }
    
    
    
}}
