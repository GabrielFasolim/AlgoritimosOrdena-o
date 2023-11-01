package BubbleSort;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args){
        Random gerador = new Random();
        int numeros [] = new int[10];
        // Preenchendo o vetor com números aleatórios
        for (int i =0; i < numeros.length; ++i)
            numeros[i] = gerador.nextInt(100);

        // Bubble Sort - O(n^2)
        int aux;
        for (int i=0; i < numeros.length; ++i){
            for (int j=i; j < numeros.length; ++j){
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

