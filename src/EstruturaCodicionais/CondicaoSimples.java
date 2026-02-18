package EstruturaCodicionais;

import java.util.Scanner;

public class CondicaoSimples {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("nota 1: ");
        float n1 = sc.nextFloat();
        System.out.print("nota 2: ");
        float n2 = sc.nextFloat();
        float m = (n1 + n2)/ 2;
        System.out.println("Sua média: " + m);

        if (m>9){
            System.out.println("Parabéns");
        }
    }
}
