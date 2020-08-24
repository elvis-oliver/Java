package a10_programapernas;

import java.util.Scanner;

public class A10_ProgramaPernas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tipo;

        System.out.print("Quantas pernas tem? ");
        int pernas = teclado.nextInt();

        switch (pernas) {
            case 1:
                tipo = "SACI";
                break;
            case 2:
                tipo = "BIPEDE";
                break;
            case 4:
                tipo = "QUADRUPEDE";
                break;
            default:
                tipo = "ET";
        }

        System.out.println("ELE É UM: " + tipo);

    }

}
