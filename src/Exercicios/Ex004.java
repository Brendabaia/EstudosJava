package Exercicios;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if ( A + B > C && A + C > B && B + C > A){

           if (A == B && B == C){
               System.out.println("Triangulo");
           } else if (A == B || A == C || B == C) {
               System.out.println("Isósceles");
           } else {
               System.out.println("Escaleno");
           }

        }

        sc.close();
    }
}
