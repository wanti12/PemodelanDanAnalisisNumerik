package soalArray3;

import java.util.Scanner;

public class dua {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);

        int n = wa.nextInt();
        int a[] = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min + " " + max);

    }

}
