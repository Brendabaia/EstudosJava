package Vetores;

import java.util.Arrays;

public class Vetor05 {
    public static void main() {
        int vet[]= {3, 4, 1, 9, 4, 6};
        for (int v: vet) {
            System.out.println( v + "");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet,8);
        System.out.println("Encontrei o valor na posicao" + p);
    }
}
