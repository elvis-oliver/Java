package a12e_exerciciorepita;

import javax.swing.JOptionPane;

public class A12e_ExercicioRepita {

    public static void main(String[] args) {

        int num = 0;
        int soma = 0;
        int impar = 0;
        int par = 0;
        int total = 0;
        int cem = 0;
        double media;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um valor <em><br>0 interrompe</em></html>"));
            soma += num;
            total++;

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            if (num > 100) {
                cem++;
            }

        } while (num != 0);

        media = soma / (total - 1);
        JOptionPane.showMessageDialog(null, "<html>RESULTADO<hr> "
                + "total de número = " + (total-1) + "<br>"
                + "soma dos valores = " + soma + "<br>"
                + "total de números pares = " + (par-1) + "<br>"
                + "total de números impares = " + impar + "<br>"
                + "números acima de 100 = " + cem + "<br>"
                + "média dos valores = " + media + "<br>"
                + "</html>");

    }
}
