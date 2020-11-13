package a4primeiroprograma;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class A4PrimeiroPrograma {

    public static void main(String[] args) {

        System.out.println("HELLO WORLD!");

        Date relogio = new Date();
        System.out.print("A HORA É: ");
        System.out.println(relogio.getHours()-1 + ":" + relogio.getMinutes() + ":" + relogio.getSeconds());

        Locale idioma = Locale.getDefault();
        System.out.println("IDIOMA: " + idioma.getDisplayLanguage() + " " + idioma.getLanguage());

        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension d = tela.getScreenSize();
        System.out.println("RESOLUÇÃO DA TELA: " + d.width + " x " + d.height);

        Calendar ano = Calendar.getInstance();
        System.out.println("ANO: " + ano.get(Calendar.YEAR));

    }

}
