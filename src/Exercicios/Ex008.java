package Exercicios;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, s = 0;
        String resp;
        do {
            System.out.println("Digite um número:");
            n = sc.nextInt();
            s += n;
            System.out.println("Quer continuar? [S/N]");
            resp = sc.next();
        }while (resp.equals("S"));
        System.out.println("A soma de todos os valores é" + s);

    }
}
