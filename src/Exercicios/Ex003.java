package Exercicios;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        double total = salario + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", total);

        sc.close();
    }
}
