package a14_vetor01;

public class A14_Vetor01 {

    public static void main(String[] args) {

        String nome[] = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int c = 0; c <= 11; c++) {
            System.out.println("O mês de " + nome[c] + " tem " + tot[c] + " dias");
        }

    }
}
