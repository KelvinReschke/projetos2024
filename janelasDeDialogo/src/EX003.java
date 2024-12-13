
import javax.swing.JOptionPane;

public class EX003 {

    public static void main(String[] args) {
        try {
            String resultados = " ";
            String numberString = JOptionPane.showInputDialog(null, "informe um número",
                    " .....:::GERADOR DE TABUADA:::....", 2);

            int number = Integer.parseInt(numberString);
            for (int i = 1; i < number + 1; i++) {
                if (number % i == 0) {
                    resultados = resultados + i + " ";
                }
            }
            JOptionPane.showInputDialog(null, resultados);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, " vc é moloide!!!\n" + ex);
        }
    }
}
