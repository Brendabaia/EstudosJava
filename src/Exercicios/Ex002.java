package Exercicios;

import java.util.Scanner;

public class Ex002 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===CINEMA TUDO CARO===");
        System.out.println("O ingresso do cinema custa R$ 40,00");

        System.out.println("Qual sua idade? ");
        int idade = sc.nextInt();

        System.out.println("Você é estudante? (sim/não)");
        String estudante = sc.next();

        System.out.println("Hoje é terça_feira? (sim/não)");
        String dia = sc.next();

        double valorIngresso = 40.0;

        if (idade <= 12) {
            valorIngresso = 10.0;
            System.out.println("- Aplicado: Desconto Infantil");
        } else if (idade >= 65 || estudante.equals("sim")) {
            valorIngresso = 20.0;
            System.out.println("- Aplicado: Meia-entrada");
        } else {
            System.out.println("- Aplicado: Valor Inteiro");
        }

        if (dia.equals("sim")) {
            double descontoTerca = valorIngresso * 0.10;
            valorIngresso = valorIngresso - descontoTerca;
            System.out.println("- Aplicado: Promoção Terça-feira (10% OFF)");
        }

        System.out.println("--------------------------------");
        System.out.printf("VALOR FINAL DO INGRESSO: R$ %.2f%n", valorIngresso);
        System.out.println("--------------------------------");

        sc.close();


    }
}
