package BubbleSort;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args){

        int numeros [] = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
        // Preenchendo o vetor com números aleatórios


        // Bubble Sort - O(n^2)
        int aux; // armazena os valores temporariamente
        for (int i=0; i < numeros.length; ++i){ //compara para quando ser necessario fazer a troca
            for (int j=i; j < numeros.length; ++j){ //
                if (numeros[i]>numeros[j]){
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        for (int i=0; i<numeros.length; ++i)
            System.out.println(numeros[i] + " ");
    }
}

