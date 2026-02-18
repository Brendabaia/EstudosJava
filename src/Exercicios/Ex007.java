package Exercicios;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade= sc.nextInt();
        int totalPessoas = 0;
        int somaIdades = 0;

        while ( idade >= 0 ){
            somaIdades += idade;
            totalPessoas++;
            idade= sc.nextInt();
        }

        System.out.println("Total de pessoas: " + totalPessoas);
        System.out.println("Soma das idades: " + somaIdades);
        sc.close();
    }
}
