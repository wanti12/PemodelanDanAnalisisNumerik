package soalArray2;

import java.util.Arrays;
import java.util.Scanner;

public class sepuluh {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();;
        }
        int c = a[0];
        System.out.println(c);
        for (int j = 0; j < b.length - 1; j++) {

            b[j] = a[j+1];
            int v = b.length-1;
            b[v] = c;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }

}
