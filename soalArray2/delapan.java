package soalArray2;

import java.util.Arrays;
import java.util.Scanner;

public class delapan {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();
        }
        for (int j = 0; j < b.length; j++) {
            int p = wa.nextInt();
            b[j] = p;
        }

        int c[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            int l = a[i] + b[i];
            c[i] = l;
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

    }

}
