package Exercicios;

import java.util.Scanner;

public class Ex001 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Usuário: ");
        String usuario = sc.nextLine();

        System.out.println("Senha: ");
        String  senha = sc.nextLine();

        if (usuario.equals("admin") && senha.equals("1234")){
            System.out.println("Acesso total concedido");
              } else if (usuario.equals("user") && senha.equals("guest")){
            System.out.println("Acesso limitado concedido");
        } else{
            System.out.println("Login ou senha incorretos");
        }


    }
}
