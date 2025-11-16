package soalArray3;

import java.util.Scanner;
import java.util.Arrays;

public class delapan {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();
        int k = wa.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();
        }

        int y = 1;
        for (int i = 1; i <= k; i++) {
            int x = a[0];
            for (int j = 0; j < a.length; j++) {

                if (j == a.length - 1) {
                    a[j] = x;
                } else if (y < a.length) {
                    a[j] = a[y];
                    y++;
                }

            }

            y = 1;
        }

        System.out.println(Arrays.toString(a));

    }

}
