/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrey;

import com.sun.org.apache.bcel.internal.generic.FADD;
import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class extraatt02 {

    Scanner entrada = new Scanner(System.in);
    String[] produto = new String[10];
    int quantidadeDeProdutos = 0;
    double[] precos = new double[10];
    int[] quantidadeNoEstoque = new int[10];
    double[] fatoramento = new double[10];

    public void menu() {
        System.out.println("=== Menu de Opções ===\n"
                + "1. Cadastrar Produto\n"
                + "2. Realizar Venda\n"
                + "3. Exibir Faturamento Total\n"
                + "4. Exibir Produto mais Vendido\n"
                + "5. Exibir Produto com Maior Faturamento\n"
                + "6. Relatório de Estoque Baixo\n"
                + "7. Sair do Programa\n"
                + "Escolha uma opção (1-7)");
    }

    public static void main(String[] args) {
                extraatt02 minhaClasse = new extraatt02();
                minhaClasse.preencherListas();
        int opcao = 0;
        do {
            minhaClasse.menu();
            opcao = minhaClasse.entrada.nextInt();
            switch (opcao) {
                case 0:
                    minhaClasse.cadastroDeProdutos();
                    break;
                case 1:
                    minhaClasse.realizacaovenda();
                    break;
                case 2:
                    minhaClasse.ExibicaoDoFaturamento();
                    break;
                case 3:
                    minhaClasse.produtosMaisvendidos();
                    break;
                case 4:
                    minhaClasse.exibirprodutosComMaiorfaturamento();
                    break;
                case 5:
                    minhaClasse.exibirListaDeEstoqueBaixo();
                    break;
                case 6:
                    minhaClasse.exibirListaDeEstoqueBaixo();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("essa opção não existe");
            }
        } while (opcao != 7);
    }

    public void cadastroDeProdutos() {
        System.out.println("informe o produto que você deseja cadastrar");
        produto[quantidadeDeProdutos] = entrada.next();
        System.out.println("informe o valor do produto");
        produto[quantidadeDeProdutos] = entrada.next();
        System.out.println("informe a quantida de produtos ");
        produto[quantidadeDeProdutos] = entrada.next();
    }

    public void realizacaovenda() {
        int quantidade = 0;

        System.out.println("----------VENDAS----------");
        System.out.println("informe o produto vendido");
        String produtoVendido = entrada.next();
        System.out.println("informe a quantidade de produtos vendidos");
        int quantidadeVendida = entrada.nextByte();
        for (int i = 0; i < 10; i++) {
            if (produtoVendido.equalsIgnoreCase(produto[i])) {
                if (quantidade <= quantidadeNoEstoque[i]) {
                    quantidadeNoEstoque[i] = quantidadeNoEstoque[i] - quantidade;
                    fatoramento[i] = fatoramento[i] * quantidade;
                    System.out.println("Você realizou a sua venda com total sucesso,PARABÉNS");
                    return;
                } else {
                    System.out.println("Infelizmente a quantidade de produtos excede ao nosso estoque");
                    return;
                }
            }
        }
        System.out.println("Produto não foi encontrado");
    }

    public void ExibicaoDoFaturamento() {
        System.out.println("O seu faturamento total foi de:  " + fatoramento + "  ");
    }

    public void produtosMaisvendidos() {
        String nomeProdutoMaisVendido = " ";
        double quantidadeDeProdutosMaisVendidos = 0;
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (quantidadeDeProdutosMaisVendidos < (fatoramento[i] / precos[i])) {
                quantidadeDeProdutosMaisVendidos = (fatoramento[i] / precos[i]);
                nomeProdutoMaisVendido = produto[i];

            }
        }
        System.out.println("o produto mais vendido foi:  " + nomeProdutoMaisVendido + "  ");
    }

    public void motrarRelatorioDeProdutos() {
        System.out.println(
                formatarSaida("Nome", 20)
                + formatarSaida("Preço", 10)
                + formatarSaida("Estoque", 10));
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            System.out.println(formatarSaida(produto[i], 20)
                    + formatarSaida("R$ " + precos[i], 10)
                    + formatarSaida("" + quantidadeNoEstoque[i], 10));
        }
    }

    public String formatarSaida(String texto, int tamanho) {
        while (texto.length() < tamanho) {
            texto = " " + texto;
        }
        return texto;
    }

    public void exibirprodutosComMaiorfaturamento() {
        double maiorFaturamento = 0;
        int indice = 0;
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (maiorFaturamento < fatoramento[i]) {
                maiorFaturamento = fatoramento[i];
                indice = i;

            }
        }
        System.out.println(produto[indice] + " Foi o produto com maior faturamento ");
    }

    public void exibirListaDeEstoqueBaixo() {
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (quantidadeNoEstoque[i] < 10) {
                System.out.println(produto[i] + ": " + quantidadeNoEstoque[i]);

            }
        }

    }

    public void preencherListas() {
        produto[0] = "Arroz";
        produto[1] = "Feijão";
        produto[2] = "Erva";
        precos[0] = 12.05;
        precos[1] = 16.55;
        precos[2] = 11.12;
        quantidadeNoEstoque[0] = 10;
        quantidadeNoEstoque[1] = 20;
        quantidadeNoEstoque[2] = 30;
        quantidadeNoEstoque[4] = 3;
    

    }
}