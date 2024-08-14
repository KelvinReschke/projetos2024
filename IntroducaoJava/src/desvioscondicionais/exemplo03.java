
package desvioscondicionais;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class exemplo03 {
     public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         System.out.println("informe \n"
                 + "F para feminino"
                 + "\nM para masculino");
         String sexo = entrada.next();
         if (sexo.equals("F")){
             System.out.println("Feminino");}
         else if (sexo.equals("M")){
             System.out.println("masculino");}
         else{
             System.out.println("sexo invalido");
             
         }
         
         
}}
