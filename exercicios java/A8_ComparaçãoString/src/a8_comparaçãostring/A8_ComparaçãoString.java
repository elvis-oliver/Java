package a8_comparaçãostring;

public class A8_ComparaçãoString {

    public static void main(String[] args) {
        String nome1 = "Elvis";
        String nome2 = "Elvis";
        String nome3 = new String("Elvis");
        boolean res = (nome1 == nome2) ? true : false;
        System.out.println(res);
        boolean res2 = (nome1 == nome3) ? true : false;
        System.out.println(res2);
        boolean res3 = (nome1.equals(nome2)) ? true : false;
        System.out.println(res3);
    }

}
