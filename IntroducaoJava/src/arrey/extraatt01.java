package arrey;

import java.util.Scanner;

public class extraatt01 {

    Scanner entrada = new Scanner(System.in);
    String[] alunos = new String[10];
    double[] notasProgramacao = new double[10];
    double[] notasdados = new double[10];
    double[] notasManutencao = new double[10];
    double[] notasRedes = new double[10];
    double[] medias = new double[10];
    int quantidadeAlunosCadastrados = 0;
    int quantidadeNotasCadastradas = 0;

    public static void main(String[] args) {
        extraatt01 minhaClasse = new extraatt01();
        int opcao = 0;
        do {
            opcao = minhaClasse.mostrarMenu();
            switch (opcao) {
                case 0:
                    minhaClasse.mostraRelatoriosDosAlunos();
                    break;
                case 1:
                    minhaClasse.cadastraraluno();
                    break;
                case 2:
                    minhaClasse.cadastrarNotas();
                    break;
                case 3:
                    minhaClasse.calcularmedias();
                    break;
                case 4:
                    minhaClasse.mostraRelatoriosDosAlunos();
                    break;
                case 5:
                    minhaClasse.alunocoMaiorMediaGeral();
                    break;
                case 6:
                    minhaClasse.alunoMaiorMediatalmateria();
                    break;
                case 7:
                    minhaClasse.mostraRelatoriosDosAlunos();
            }

        } while (opcao != 8);
    }

    public int mostrarMenu() {
        System.out.println("=== Menu de Opções ===\n"
                + "tecle 1 para mostraRelatoriosDosAlunos\n"
                + "tecle 2 para Cadastrar Alunos\n"
                + "tecle 3 parava Cadastrar Notas\n"
                + "tecle 4 para Calcular Médias\n"
                + "tecle 5 para Exibir Médias\n"
                + "tecle 6 para Exibir Aluno com Maior Média\n"
                + "tecle 7 para Exibir Aluno com Maior Nota em determinada Disciplina\n"
                + "tecle 8 para Exibir lista de alunos com o resultado final (aprovado ou reprovado)\n"
                + "tecle 9 para Sair do Programa\n");
        int opcaoEscolhida = entrada.nextInt();
        return opcaoEscolhida;
    }

    public void cadastraraluno() {
        System.out.println("Informe o nome do aluno: ");
        alunos[quantidadeAlunosCadastrados] = entrada.next();
        quantidadeAlunosCadastrados++;

    }

    public void cadastrarNotas() {
        System.out.println("informe a nota do aluno "+alunos[quantidadeNotasCadastradas] + " da disciplina programacao");
        notasProgramacao[quantidadeNotasCadastradas] = entrada.nextDouble();

        System.out.println("informe a nota do aluno "+alunos[quantidadeAlunosCadastrados]+ " da disciplina dados");
        notasdados[quantidadeNotasCadastradas] = entrada.nextDouble();

        System.out.println("informe a nota do aluno "+alunos[quantidadeAlunosCadastrados] +" da disciplina manutencao");
        notasManutencao[quantidadeNotasCadastradas] = entrada.nextDouble();

        System.out.println("informe a nota do aluno "+alunos[quantidadeAlunosCadastrados]+ " da disciplina redes");
        notasRedes[quantidadeNotasCadastradas] = entrada.nextDouble();

        quantidadeNotasCadastradas++;

    }

    public void mostraRelatoriosDosAlunos() {
        for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
            System.out.println(alunos[i] + ": "
                    + notasProgramacao[i] + ": "
                    + notasdados[i] + ": "
                    + notasManutencao[i] + ": "
                    + notasRedes[i] + ": "
                    + medias[i] + ": ");
        }
    }

    public void calcularmedias() {
        for (int i = 0; i < quantidadeNotasCadastradas; i++) {
            medias[i] = (notasProgramacao[i] + notasManutencao[i] + notasRedes[i] + notasdados[i]) / 4;

        }
    }

    public void alunocoMaiorMediaGeral() {
        double maiorMedia = 0;
        int indice = 0;
        for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                indice = i;
            }
        }

        System.out.println(alunos[indice] + " ficou com a maior media geral. media:  " + medias[indice]);
    }

    public void alunoMaiorMediatalmateria() {
        double maiorNota = 0;
        int indice = 0;
        System.out.println("informe a disciplibna que deseja consultrar:  ");
        String disciplina = entrada.next();
        switch (disciplina) {
            case "programacao":
                for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
                    if (maiorNota < notasProgramacao[i]) {
                        maiorNota = notasProgramacao[i];
                        indice = i;
                    }
                }
                break;
            case "redes":
                for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
                    if (maiorNota < notasRedes[i]) {
                        maiorNota = notasRedes[i];
                        indice = i;

                    }
                }
                break;

            case "manutenção":
                for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
                    if (maiorNota < notasManutencao[i]) {
                        maiorNota = notasManutencao[i];
                        indice = i;

                    }
                }
                break;
            case "dados":
                for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
                    if (maiorNota < notasdados[i]) {
                        maiorNota = notasdados[i];
                        indice = i;
                    }
                }
                break;
            default:
                System.out.println("essa disciplina não está em nosso sistema: ");

        }
        System.out.println(alunos[indice]
                + "ficou com a maior nota na disciplina de " + disciplina + " ");

    }

    public void mostrarResultadoFinal() {
        for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
            if (medias[i] >= 6) {
                System.out.println(alunos[i] + ": aprovado !");
            } else {
                System.out.println(alunos[i] + ": reprovado !");

            }
        }
    }

}
