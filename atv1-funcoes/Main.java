import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Ranking de Notas");
            System.out.println("2 - Caixa Eletrônico");
            System.out.println("3 - Validador de Senha");
            System.out.println("4 - Conversão de Tempo");
            System.out.println("5 - Verificar Elementos Únicos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};

                    double media = Funcoes.calcularMedia(notas);
                    int acima = Funcoes.contarAcimaDaMedia(notas, media);
                    double maior = Funcoes.encontrarMaiorNota(notas);

                    System.out.printf("Média: %.2f%n", media);
                    System.out.println("Acima da média: " + acima);
                    System.out.printf("Maior nota: %.2f%n", maior);
                    break;

                case 2:
                    System.out.print("Digite o valor: ");
                    int valor = sc.nextInt();

                    int[] cedulas = Funcoes.calcularCedulas(valor);

                    System.out.println("Notas de 50: " + cedulas[0]);
                    System.out.println("Notas de 20: " + cedulas[1]);
                    System.out.println("Notas de 10: " + cedulas[2]);
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = sc.nextLine();

                    boolean tamanhoOk = Funcoes.tamanhoValido(senha);
                    boolean especialOk = Funcoes.temCaractereEspecial(senha);

                    if (tamanhoOk && especialOk) {
                        System.out.println("Senha Válida");
                    } else {
                        System.out.println("Senha Inválida");
                    }
                    break;

                case 4:
                    System.out.print("Digite os segundos: ");
                    int segundos = sc.nextInt();

                    int[] tempo = Funcoes.converterTempo(segundos);

                    System.out.println(tempo[0] + "h " +
                            tempo[1] + "min " +
                            tempo[2] + "seg");
                    break;

                case 5:
                    int[] vetor = {10, 5, 8, 2, 7, 3, 5};

                    if (Funcoes.verificarElementosUnicos(vetor)) {
                        System.out.println("Todos são únicos.");
                    } else {
                        System.out.println("Há números repetidos.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}