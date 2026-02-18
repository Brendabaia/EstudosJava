package EstruturaCodicionais;

import java.util.Scanner;

public class CodicaoComposta {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int nasc  = sc.nextInt();
        int ano = 2026;
        int idade = ano - nasc ;
        System.out.println("Sua idade: " + idade);
        if (idade >=18){
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("menor de idade");
        }
    }
}
