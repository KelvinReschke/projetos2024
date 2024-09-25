package arrey;

import java.util.Scanner;
import sun.security.util.Length;

/**
 *
 * @author kelvin
 */
public class att03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[10];
        String MaiorNome = "";
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome: " + (i + 1));
            nomes[i] = entrada.next();
        }
        for (int i = 0; i < 5; i++) {
            if (nomes[i].length() > MaiorNome.length()) {
                MaiorNome = nomes[i];
            }
        }
        System.out.println(MaiorNome);

    }

}
