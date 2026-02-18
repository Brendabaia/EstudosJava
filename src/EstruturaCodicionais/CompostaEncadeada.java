package EstruturaCodicionais;

import java.util.Scanner;

public class CompostaEncadeada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int nasc  = sc.nextInt();

        int ano = 2026;
        int idade = ano - nasc ;

        System.out.println("Sua idade: " + idade);

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("Voto opcional.");
        } else {
            System.out.println("Voto obrigatório.");
        }
    }
}

