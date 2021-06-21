package work;

public class A {
    int u, v;

    void p2(int x, int y) {

        int i, j;

        for (i=1; i<=x;i++) {

            j = y+i;

            System.out.print(j+" "); }       }

    void p( ) {

        u=3; v=2; p2(u, v);

        System.out.println();

        u+=v; v*=u; p2(u, v);   }

}

class Exam11 {

    public static void main(String args[]) {
        int[] ar = new int[]{1,2,3,4,5};
        System.out.println(ar);
        A a = new A();

        a.p();        }

}
