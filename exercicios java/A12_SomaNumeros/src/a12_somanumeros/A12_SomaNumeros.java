package a12_somanumeros;

import java.util.Scanner;

public class A12_SomaNumeros {

    public static void main(String[] args) {

        int num, soma = 0;
        String resp;

        do {
            System.out.print("Digite um número: ");
            Scanner teclado = new Scanner(System.in);
            num = teclado.nextInt();
            soma += num;
            System.out.print("Deseja Continuar? [S/N] ");
            resp = teclado.next();
        } while (resp.equals("S"));

        System.out.println("A soma dos valores é: " + soma);

    }
}
