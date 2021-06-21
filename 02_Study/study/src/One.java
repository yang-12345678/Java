import java.util.Scanner;
import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        int[] x = new int[10];
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        System.out.println("max:" + x[x.length - 1]);
        System.out.println("min:" + x[0]);
        System.out.println("avg:" + sum/10);
    }
}
