package Exercicios;

import java.util.Scanner;

public class Ex012 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + " " + quadrado + " " + cubo);
        }

    }
}
