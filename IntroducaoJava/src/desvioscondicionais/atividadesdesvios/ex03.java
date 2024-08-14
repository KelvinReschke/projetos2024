


//Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se somar os dois, caso
//contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma
//variável C e mostrar seu conteúdo na tela
package desvioscondicionais.atividadesdesvios;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class ex03 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        System.out.println("informe o valor A");
        double A = entrada.nextDouble();
        System.out.println("informe o valor B");
        double B = entrada.nextDouble();
        double C;
        if(A==B){
            C=A+B;
        }else{
            C=+A*B;
        }
        System.out.println(" o valor de c é " + C);        
    }
}
