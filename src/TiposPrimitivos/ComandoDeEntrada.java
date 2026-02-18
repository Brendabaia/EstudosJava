package TiposPrimitivos;

import java.util.Scanner;

public class ComandoDeEntrada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite a nota do aluno");
        float nota = sc.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome, nota);
    }
}
