package EstruturaCodicionais;

import java.util.Scanner;

public class CondicaoMultipla {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int perna = sc.nextInt();
        String tipo;
        System.out.println("Isso é um(a) ");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "Et";
                break;

        }
        System.out.println(tipo);
        sc.close();

    }
}
