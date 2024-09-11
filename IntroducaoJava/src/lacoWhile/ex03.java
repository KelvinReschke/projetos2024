
         
         
         
package lacoWhile;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class ex03 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        System.out.println("informe o usuario");
        String nome = entrada.next();
        while(nome.length() <=3){
            System.out.println("informe um nome com mais de 3 caracteres;");
        nome = entrada.next();
        
        }
        System.out.println("informe a sua idade");
        int idade = entrada.nextInt();
        while (idade < 0 || idade > 150){
            System.out.println("informe um número de 0 a 150 caracteres;");
        idade = entrada.nextInt();
        }
         
        System.out.println("informe o seu salário");
        double salario = entrada.nextDouble();
        while(salario < 0){
            System.out.println("informe um salário maior que 0 ;");
        salario = entrada.nextInt();
        }
         System.out.println("informe o seu sexo ");
        String sexo = entrada.next();
        while(!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F") ){
            System.out.println("informe o se sexo com  (M ou F)  ;");
        sexo = entrada.next();
        }
         System.out.println("informe o seu estado cívil ");
        String estado = entrada.next();
        while(!estado.equalsIgnoreCase("s") && !estado.equalsIgnoreCase("c") && !estado.equalsIgnoreCase("v") && !estado.equalsIgnoreCase("d")){
            System.out.println("informe o seu estado cívil com (S,C,V ou D)  ;");
        sexo = entrada.next();
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
         
         
         
         
         
         
         
         
}
}
        