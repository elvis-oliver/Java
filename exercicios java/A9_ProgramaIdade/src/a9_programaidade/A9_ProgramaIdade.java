package a9_programaidade;

import java.util.Scanner;

public class A9_ProgramaIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ano de nascimento: ");
        int anoN = teclado.nextInt();
        int idade = 2020 - anoN;
        System.out.println("sua idade é: " + idade);
        if (idade < 18) {
            System.out.println("MENOR DE IDADE");
        } else {
            System.out.println("MAIOR DE IDADE");
        }
    }

}
