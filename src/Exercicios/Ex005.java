package Exercicios;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioBruto = sc.nextDouble();
        double vDesconto = 0;
        String aliquotaStr = "";

        if (salarioBruto <= 2112.00) {
            aliquotaStr = "Isento";
            vDesconto = 0;
        } else if (salarioBruto <= 2826.65) {
            aliquotaStr = "7.5%";
            vDesconto = salarioBruto * 0.075;
        } else if (salarioBruto <= 3751.05) {
            aliquotaStr = "15.0%";
            vDesconto = salarioBruto * 0.15;
        } else if (salarioBruto <= 4664.68) {
            aliquotaStr = "22.5%";
            vDesconto = salarioBruto * 0.225;
        } else {
            aliquotaStr = "27.5%";
            vDesconto = salarioBruto * 0.275;
        }

        double salarioLiquido = salarioBruto - vDesconto;

        System.out.printf("Salario Bruto: R$ %.2f%n", salarioBruto);
        System.out.println("Alíquota: " + aliquotaStr);
        System.out.printf("Desconto: R$ %.2f%n", vDesconto);
        System.out.printf("Salario Liquido: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}
