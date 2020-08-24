package a9_programamedia;

import java.util.Scanner;

public class A9_ProgramaMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println("sua média foi: " + m);
        if (m >= 9) {
            System.out.println("PARABENS!");
        }

    }

}
