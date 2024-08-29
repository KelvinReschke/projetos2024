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
public class exextra01 {
      
 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldoAnterior = 5000;
        double saldo = 0;
        String usuario = "Kelvin";
        String senha = "1234";
        String nConta = "64575-9";
        System.out.println("Informe o nome de usuário: ");
        String loginUsuario = entrada.next();
        System.out.println("Informe a senha: ");
        String loginSenha = entrada.next();
        if (loginUsuario.equals(usuario) && senha.equals("1234")) {
            System.out.println("Acesso permitido.");
            System.out.println("Qual ação deseja efetuar?"
                    + "\n Digite 'S' para efetuar um saque."
                    + "\n Digite 'D' para efetuar um depósito.");
            String efetuar = entrada.next();
            if (efetuar.equalsIgnoreCase("S")) {
                System.out.println("Quanto deseja sacar? ");
                System.out.println("Saldo atual: " + saldoAnterior);
                double valorSaque = entrada.nextDouble();
                saldo = saldoAnterior - valorSaque;

                System.out.println("Extrato"
                        + "\n Nome: " + usuario
                        + "\n Conta: " + nConta
                        + "\n Saldo anterior: " + saldo
                        + "\n Saque: " + valorSaque
                        + "\n Saldo atual: " + saldo);

            } else {
                System.out.println("Quanto deseja depositar? ");
                System.out.println("Saldo atual: " + saldoAnterior);
                double valorDeposito = entrada.nextDouble();
                saldo = saldoAnterior + valorDeposito;

                System.out.println("Extrato"
                        *****************************
                        + "\n Nome: " + usuario
                        + "\n Conta: " + nConta
                        + "\n Saldo anterior: " + saldo
                        + "\n Deposito: " + valorDeposito
                        + "\n Saldo atual: " + saldo);
            }
        } else {
            System.out.println("Acesso negado.");
 

}     
               
       
       
       
       
       
       
       
       
       
       
}}
