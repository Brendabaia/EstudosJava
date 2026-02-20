package Exercicios;

public class Ex009 {
    public static void main() {
        double v = 30000;
        for (int p = 1; p <= v; p++) {
            double vp = v / p;
            if (vp >= 1000) {
                System.out.println("Parcela "+ p +" R$ "+ vp);
            }else {
                break;
            }
        }
    }
}
