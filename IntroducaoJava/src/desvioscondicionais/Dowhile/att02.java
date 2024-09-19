/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desvioscondicionais.Dowhile;

import static desvioscondicionais.Dowhile.att01.cardapio;
import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class att02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String lanches = " ";
        double ingressos = 0;
        double valorTotal = 0;
        double valorFilme = 0;
        double ValorLanche = 0;
        int QuantIngressos = 0;
        int QuantLanches = 0;
        String filme = " ";
        do {
          filmesEmExibição() ;
            int filmeEscolhido = entrada.nextInt();
            switch (filmeEscolhido) {
                case 1:
                    valorTotal += 22.90;
                    valorFilme += 22.90;
                    QuantIngressos++;
                    break;
                case 2:
                    valorTotal += 25.00;
                    valorFilme += 25.00;
                    QuantIngressos++;
                    break;
                case 3:
                    valorTotal += 22.00;
                    valorFilme += 22.00;
                    QuantIngressos++;
                    break;
                case 4:
                    valorTotal += 15.00;
                    valorFilme += 15.00;
                    QuantIngressos++;
                    break;
                case 5:
                    valorTotal += 25.00;
                    valorFilme += 25.00;
                    QuantIngressos++;
            }
            System.out.println("deseja mais algum filme? "
                    + "\n S = sim "
                    + "\n N = não");

        } while (filme.equalsIgnoreCase("S"));
do{
    lanchesDisponiveis();
        int cardápio = entrada.nextInt();
        switch (cardápio) {
            case 1:
                valorTotal += 10.00;
                ValorLanche += 10.00;
                QuantLanches++;
                break;
            case 2:
                valorTotal += 8.00;
                ValorLanche += 8.00;
                QuantLanches++;
                break;
            case 3:
                valorTotal += 12.00;
                ValorLanche += 12.00;
                QuantLanches++;
                break;
            case 4:
                valorTotal += 15.00;
                ValorLanche += 15.00;
                QuantLanches++;
                break;
            case 5:
                valorTotal += 5.00;
                ValorLanche += 5.00;
                QuantLanches++;

                System.out.println("deseja mais algum lanche? "
                        + "\n S = sim "
                        + "\n N = não");
        }}
        while (lanches.equalsIgnoreCase("S"));
        System.out.println("você não quis comer nada? okk");
        System.out.println("");

        System.out.println("Pedido realizado com sucesso!"
                + "\n_--- Volte Sempre! ---_"
                + "\nNúmero de ingressos adquiridos: " + QuantIngressos + "\n"
                + "Valor total de ingressos: " + valorFilme + "\n"
                + "Número de pedidos feitos: " + QuantLanches + "\n"
                + "Valor total de pedidos: " + ValorLanche + "\n"
                + "Total a pagar: " + (valorFilme+ValorLanche));   
        
        
        

    }

    public static void filmesEmExibição() {
        System.out.println("...............FILMES EM EXIBIÇÃO................"
                + "\n 1- A volta dos que não foram.............R$ 22,90 "
                + "\n 2- A vaca que não dava leite.............R$ 25,00"
                + "\n 3- Terror na Floresta ...................R$ 22,00"
                + "\n 4- Documentário Animal ................. R$ 15,00\n"
                + "\n 5- Filme de Ação.........................R$ 25,00      ");
        System.out.println("escolha o filme que deseja assitir:  ");
    }

    public static void lanchesDisponiveis() {
        System.out.println("................CÁRDAPIO............"
                + "\n 1- Pipoca Média.............R$ 10,00"
                + "\n 2- Refrigerante.............R$ 8,00"
                + "\n 3- Nachos..................R$ 12,00"
                + "\n 4- Balde de Pipoca Grande..R$ 15,00"
                + "\n 5- Chocolate...............R$ 5,00");
        System.out.println("escolha o seu lanche:  ");
    }
}
