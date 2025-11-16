package soalArray2;

import java.util.Scanner;

public class lima {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();

        int a[] = new int[n];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }

        int ra = max - min;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("rentang nilai = " + ra);

    }

}
