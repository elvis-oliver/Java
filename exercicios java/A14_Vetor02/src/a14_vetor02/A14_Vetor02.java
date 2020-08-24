package a14_vetor02;

import java.util.Arrays;

public class A14_Vetor02 {

    public static void main(String[] args) {

        double v[] = {3.8, -5, 11.1, -0.15, 11.1};
        System.out.println("O número de casas do vetor é: " + v.length);
        System.out.println("O valor '11.1' esta na posição: " + Arrays.binarySearch(v, 11.1));
        Arrays.sort(v);
        for (double valor : v) {
            System.out.print(valor + "   ");
        }

        System.out.println(" ");
        int vetor[] = new int[20];
        Arrays.fill(vetor, 17);
        for (int c = 0; c <= 50; c++) {
            System.out.print(vetor[c] + " ");
        }

    }
}
