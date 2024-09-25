package arrey;

import java.util.Scanner;

public class att04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int media = 0;
        int valor[] = new int[8];
        int somaTodosNumeros = 0;
        for (int i = 0; i < 8; i++) {
            System.out.println("Informe um número: " + (i + 1));
            valor[i] = entrada.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            somaTodosNumeros = valor[i] + somaTodosNumeros;
        }
        System.out.println("A média desses números é: " + somaTodosNumeros / 8);

        media = somaTodosNumeros/8;
        System.out.println("notas acima da media: "  );
        for (int i = 0; i > 8; i++) {
            if(valor [i] > media){
                System.out.println(valor[i]+" ");
            }
        }
    }

}
