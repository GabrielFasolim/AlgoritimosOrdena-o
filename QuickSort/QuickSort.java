package QuickSort;
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] vetor = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println(Arrays.toString(vetor)); // Exibe o array desordenado
        quickSort(vetor, 0, vetor.length - 1); // Chama o método QuickSort para ordenar o array
        System.out.println(Arrays.toString(vetor)); // Exibe o array ordenado
    }

    // O método quickSort implementa o algoritmo QuickSort.
    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1); // Ordena a subárvore à esquerda do pivo
            quickSort(vetor, posicaoPivo + 1, fim); // Ordena a subárvore à direita do pivo
        }
    }

    // O método separar é usado para encontrar a posição correta do pivô.
    private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1;
        while (i <= fim) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[fim])
                fim--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[fim];
                vetor[fim] = troca;
                i++;
                fim--;
            }
        }
        vetor[inicio] = vetor[fim];
        vetor[fim] = pivo;
        return fim; // Retorna a posição final do pivô
    }
}
