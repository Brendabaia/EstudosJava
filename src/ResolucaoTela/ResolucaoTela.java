package ResolucaoTela;

import java.awt.*;

public class ResolucaoTela {
    public static void main (String[] args){

        Toolkit resolucao = Toolkit.getDefaultToolkit();

        Dimension tela = resolucao.getScreenSize();

        System.out.println("Sua tela tem a resulução de " + tela.width + " x " + tela.height);

    }
}
