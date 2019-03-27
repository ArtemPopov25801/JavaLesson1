package FirstProgramm;

public class FirstClass {
    public static void main(String[] s) {
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {


            }
            System.out.println(s[i]);
            System.out.println(SecondClass.plus(i,j));
            System.out.println(SecondClass.mult(i,j));
            System.out.print(" ");
        }
        System.out.println();
    }
}



