
import firstPackage.*;

public class FirstClass {

    public static void main(String[] s) {

        SecondClass o = new SecondClass(5, 12);

        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                o.setI(i);
                o.setJ(j);
                System.out.print(o.mult());
                // System.out.print(o.plus());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
