
import javax.swing.JOptionPane;

public class EX002 {

    public static void main(String[] args) {

        int opcao = JOptionPane.showConfirmDialog(null, "Você gosta de programação?",
                ".....::PERGUNTA::.....", JOptionPane.YES_NO_OPTION);
        if (opcao == 0) {
            JOptionPane.showMessageDialog(null,
                    "gosta de programação! uhuuu");
        } else {
            JOptionPane.showMessageDialog(null,
                    "você não gosta? Que pena,vai se arrepender eternamente sua nota é = a 0");
        }
    }
}
