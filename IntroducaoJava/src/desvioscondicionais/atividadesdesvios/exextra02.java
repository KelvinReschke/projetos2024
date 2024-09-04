/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desvioscondicionais.atividadesdesvios;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class exextra02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira o valor de A");
        double A = entrada.nextDouble();
        System.out.println("informe o valor de B");
        double B = entrada.nextDouble();
        System.out.println("informe o valor de C");
        double C = entrada.nextDouble();
        double delta = Math.pow(B, 2) - (4 * A * C);
        if (A == 0 && B == 0) {
            System.out.println("equação degerada");
        } else if (A == 0 && B != 0) {
            System.out.println("x1 == " + (-C / B));
        } else if (A != 0 && C == 0) {
            System.out.println("x1 == 0"
                    + "x2 ==" + (-B / A));
        } else if (A != 0 && C != 0 && delta >= 0) {
            System.out.println("x1 = "
                    + ((-B + Math.sqrt(delta))) / (2 * A));
            System.out.println("x2 = "
                    + ((-B - Math.sqrt(delta))) / (2 * A));
        } else if (A != 0 && C != 0 && delta < 0);
        System.out.println("As raíses são complexas");
    }

    
          else() {
        System.out.println("seu números são invalidos para o calculo de raíz");

    }

}

}
}
