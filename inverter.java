//  Implemente uma função chamada inverter_lista(vetor) que receba um array de
// inteiros e inverta a ordem de seus elementos sem utilizar um vetor auxiliar (estratégia in-place).
// Inicio: [10, 20, 30, 40, 50]
// Iteração 1: [50, 20, 30, 40, 10]
// Iteração 2: [50, 40, 30, 20, 10]


public static void inverterLista(int[] vetor) {

    int inicio = 0;
    int fim = vetor.length - 1;

    while (inicio < fim) {

        int temp = vetor[inicio];
        vetor[inicio] = vetor[fim];
        vetor[fim] = temp;

        inicio++;
        fim--;
    }
}
