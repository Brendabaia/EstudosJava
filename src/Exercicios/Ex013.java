package Exercicios;

import java.util.Scanner;

public class Ex013 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        int soma = 0;

        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0){
                soma += i;
            }
            System.out.println(soma);
        }
    }
}
