/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaojava;

import java.util.Scanner;

/**
 *
 * @author kelvi
 */
public class Exercicio06 {
    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
        System.out.println("Cálculo do valor do veículo");
        System.out.println("informe o valor de fábrica do veículo");
        double valordeFábrica = entrada.nextDouble();
    
        double lucrodoDistribuidor = entrada.nextDouble();
        double valorImposto = valordeFábrica * 0.45;
        double valorDistribuidor = valordeFábrica * 0.28;
        double total = valordeFábrica + valorImposto + valorDistribuidor;
        int validos = entrada.nextInt();
        System.out.println("o valor final do carro é: "+total);
}
}
