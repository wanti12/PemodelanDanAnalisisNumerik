package soalArray3;

import java.util.Scanner;

public class enam {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();
        int a[] = new int[n];

        int max = Integer.MIN_VALUE;
        int maxdua = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();
            if (a[i] > max) {
                maxdua = max;
                max = a[i];
            } else if (a[i] > maxdua && a[i] < max) {
                maxdua = a[i];
            }

        }

        System.out.println(maxdua);
    }

}
