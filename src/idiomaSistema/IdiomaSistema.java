package idiomaSistema;

import java.util.Locale;

public class IdiomaSistema {
    public static  void main (String[] args){
        Locale sistema = Locale.getDefault();

        System.out.println("Seu Sistema está em " + sistema.getDisplayLanguage());
        System.out.println("País: " + sistema.getDisplayCountry());
        System.out.println("Tag: " + sistema.toLanguageTag());
    }
}
