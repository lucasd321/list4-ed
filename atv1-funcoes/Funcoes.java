public class Funcoes {

    // =========================
    // QUESTÃO 1

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static int contarAcimaDaMedia(double[] notas, double media) {
        int contador = 0;
        for (double nota : notas) {
            if (nota > media) {
                contador++;
            }
        }
        return contador;
    }

    public static double encontrarMaiorNota(double[] notas) {
        double maior = notas[0];
        for (double nota : notas) {
            if (nota > maior) {
                maior = nota;
            }
        }
        return maior;
    }

    // =========================
    // QUESTÃO 2
    // =========================

    public static int[] calcularCedulas(int valor) {
        int[] cedulas = new int[3];

        cedulas[0] = valor / 50;
        valor %= 50;

        cedulas[1] = valor / 20;
        valor %= 20;

        cedulas[2] = valor / 10;

        return cedulas;
    }

    // =========================
    // QUESTÃO 3
    // =========================

    public static boolean tamanhoValido(String senha) {
        return senha.length() >= 8;
    }

    public static boolean temCaractereEspecial(String senha) {
        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);
            if (c == '@' || c == '#' || c == '$' || c == '%' || c == '&' || c == '*') {
                return true;
            }
        }
        return false;
    }

    // =========================
    // QUESTÃO 4
    // =========================

    public static int[] converterTempo(int totalSegundos) {
        int[] tempo = new int[3];

        tempo[0] = totalSegundos / 3600;
        totalSegundos %= 3600;

        tempo[1] = totalSegundos / 60;
        tempo[2] = totalSegundos % 60;

        return tempo;
    }

    // QUESTÃO 5
    // =========================

    public static boolean verificarElementosUnicos(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}