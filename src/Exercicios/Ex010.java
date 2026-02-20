package Exercicios;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                System.out.println(x + " NULL");
            }else {
                String res = (x % 2 == 0) ? "PAR": "IMPAR";

                if (x > 0) {
                    res += " POSITIVO";
                } else {
                    res+= " NEGATIVO";
                }

                System.out.println(res);
            }
        }

    }
}

