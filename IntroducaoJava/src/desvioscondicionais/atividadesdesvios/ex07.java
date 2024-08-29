// Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso
//ideal, utilizando as seguintes fórmulas:
//a) para homens: (72.7 * h) – 58;
//b) para mulheres: (62.1 * h) – 44.7
package desvioscondicionais.atividadesdesvios;

import com.sun.xml.internal.bind.v2.schemagen.Util;
import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class ex07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe a sua altura");
        double altura = entrada.nextDouble();
        System.out.println("informe o seu sexo");
        String sexo = entrada.next();
        if (sexo.equalsIgnoreCase("f")) {
            double pesoIdeal = 62.1 * altura - 44.7;

            System.out.println("peso ideal " + pesoIdeal);
        } else if (sexo.equalsIgnoreCase("m")) {
            double pesoIdeal = 72.7 * altura - 58;
            System.out.println("peso ideal " + pesoIdeal);
        } else {
            System.out.println("não é possível calcular o peso ideal,"
                    + "pois o sexo informado não é valido");
        }
    }

}


