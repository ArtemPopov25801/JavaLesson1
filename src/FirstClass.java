
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

class SecondClass {

    private int i;
    private int j;

    public SecondClass(int i, int j) {
        this.i = i;
        this.j = j;
    }


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public  int plus() {
        return i + j;
    }

    public  int mult() {
        return i * j;
    }
}

