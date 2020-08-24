package a15e_funcao01;

public class Fatorial {

    private int num = 0;
    private int fat = 1;
    private String form = "";

    public void setValor(int n) {
        num = n;
        int fatorial = 1;
        String formula = "";
        for (int c = n; c > 1; c--) {
            fat *= c;
            form += c + " x ";
        }
        form += "1 = ";
    }

    public int getFat() {
        return fat;
    }

    public String getForm() {
        return form;
    }

}
