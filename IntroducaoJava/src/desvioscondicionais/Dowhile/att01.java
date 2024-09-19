package desvioscondicionais.Dowhile;

//* @author kelvin
import java.util.Scanner;

public class att01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcao = "";
        double valorTotal = 0;
        double totalCalorias = 0;
        do {
            cardapio();
            int prato = entrada.nextInt();
            switch (prato) {
                case 1:
                    valorTotal += 45.00;
                    totalCalorias += 500;
                    break;
                case 2:
                    valorTotal += 48.00;
                    totalCalorias += 480;
                    break;
                case 3:
                    valorTotal += 50.00;
                    totalCalorias += 440;
                    break;
                case 4:
                    valorTotal += 45.00;
                    totalCalorias += 440;
                    break;
                case 5:
                    valorTotal += 38.00;
                    totalCalorias += 500;
                    break;
                case 6:
                    valorTotal += 30.00;
                    totalCalorias += 540;
                    break;
                case 7:
                    valorTotal += 22.00;
                    totalCalorias += 460;
                    break;
                case 8:
                    valorTotal += 27.00;
                    totalCalorias += 490;
                    break;
                case 9:
                    valorTotal += 25.00;
                    totalCalorias += 340;
                    break;
                case 10:
                    valorTotal += 25.00;
                    totalCalorias += 580;
                    break;
                case 11:
                    valorTotal += 12.00;
                    totalCalorias += 480;
                    break;
                case 12:
                    valorTotal += 12.00;
                    totalCalorias += 440;
                    break;
                case 13:
                    valorTotal += 10.00;
                    totalCalorias += 440;
                    break;
                case 14:
                    valorTotal += 7.00;
                    totalCalorias += 500;
                    break;
                case 15:
                    valorTotal += 8.00;
                    totalCalorias += 540;
                    break;
                case 16:
                    valorTotal += 12.00;
                    totalCalorias += 460;
                    break;
                case 17:
                    valorTotal += 5.00;
                    totalCalorias += 490;
                    break;
                case 18:
                    valorTotal += 10.00;
                    totalCalorias += 340;
                    break;
                case 19:
                    valorTotal += 5.00;
                    totalCalorias += 580;
                    break;
            }
            System.out.println("deseja mais alguma coisa? "
                    + "\n S = sim "
                    + "\n N = não");

            opcao = entrada.next();

        }while(opcao.equalsIgnoreCase("S"));
        
        System.out.println("o valor da sua compra é de:  "
                + "\nvalorTotal: " + valorTotal+
                "\ntotalCalorias: " + totalCalorias);
        
    }



public static void cardapio() {
        System.out.println("\n__________________CÁRDAPIO/PIZZAS______________"
                + ""
                + "\nPizza de calabresa............R$ 45,00 "
                + "\nPizza de frango...............R$ 48,00 "
                + "\nPizza de strogonoof...........R$ 50,00"
                + "\nPizza de alho e olho..........R$ 45,00"
                + "\nPizza de 4queijos............R$ 38,00"
                + "\n______________________CÁRDAPIO/X_________________"
                + "\nXtudo ........................R$ 30,00 "
                + "\nXsalada.......................R$ 22,00"
                + "\nXiscas de franco .............R$ 27,00 "
                + "\nXbacon........................R$ 25,00"
                + "\nXda casa......................R$ 25,00"
                + ""
                + "\n_____________________BEBIDAS_________________ "
                + "\ncerveja/skol 1L...............R$ 12,00"
                + "\ncerveja/antartica 1L..........R$ 12,00  "
                + "\ncerveja/polar 1L..............R$ 10,00"
                + "\ncerveja/skol 473ml............R$ 7,00"
                + "\ncerveja/original473ml.........R$ 8,00 "
                + "\ncoca-cola 2.5L................R$ 12,00"
                + "\ncoca-cola 600ml...............R$ 5,00  "
                + "\nguaraná antartica 2.5L........R$ 10,00 "
                + "\nguaraná antartica 600ml.......R$ 4,50 ");
        System.out.println("escolha o seu prato: ");
    }
}
