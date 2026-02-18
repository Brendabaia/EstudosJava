package TiposPrimitivos;

public class TesteTipos {
    public static void main (String[] args){
       /* int idade = 30;
        *String valor= Integer.toString(idade);
        *System.out.println(valor);
        */
        String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);


        String valor2 = "30.5";
        float idade2 = Float.parseFloat(valor2);
        System.out.printf("%.3f", idade2);
    }
}
