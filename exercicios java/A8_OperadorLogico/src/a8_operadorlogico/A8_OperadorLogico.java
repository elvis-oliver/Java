package a8_operadorlogico;

public class A8_OperadorLogico {

    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean res = ((x < y) && (y < z)) ? true : false;
        System.out.println(res);
        boolean res2 = ((x == y) || (y > z)) ? true : false;
        System.out.println(res2);
    }

}
