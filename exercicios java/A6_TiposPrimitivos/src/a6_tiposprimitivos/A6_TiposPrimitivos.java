package a6_tiposprimitivos;

import java.util.Scanner;

public class A6_TiposPrimitivos {

    public static void main(String[] args) {
        //SAIDA DE DADOS
        /*
         *String nome = "Elvis";
         *float nota = 9.5f;
         *System.out.println("A nota é " + nota);
         *System.out.format("A nota de %s é %.3f \n", nome, nota);
         */

        //ENTRADA DE DADOS
        /*
         *Scanner teclado = new Scanner(System.in);
         *System.out.print("Digite o nome do aluno: ");
         *String nome = teclado.nextLine();
         *System.out.print("Digite a nota do aluno: ");
         *Float nota = teclado.nextFloat();
         *System.out.println("A nota é " + nota);
         *System.out.format("A nota de %s é %.2f \n", nome, nota);
         */
        
        //CONVERSÃO
        /*String numero = "5";
         *int valor = Integer.parseInt(numero);
         *System.out.println(valor);
         */
        /*int numero = 7;
         *String valor = Integer.toString(numero);
         *System.out.println(valor);
         */
        
        float numero = 9.5f;
        String valor = Float.toString(numero);
        System.out.println(valor);
    }

}
