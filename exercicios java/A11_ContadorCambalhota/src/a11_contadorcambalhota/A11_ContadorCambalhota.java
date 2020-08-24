package a11_contadorcambalhota;

public class A11_ContadorCambalhota {

    public static void main(String[] args) {

        int cc = 0;
        while (cc < 8) {
            cc++;

            if (cc == 2 || cc == 3) {
                continue;
            }
            if (cc > 6) {
                break;
            }

            System.out.println("cambalhota " + cc);

        }

    }

}
