package Exercicios;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x % 2 == 0 && x > 0){
                soma += x;
            }
        }
        System.out.println("Soma dos pares positivos:" + soma);
        sc.close();
    }
}

