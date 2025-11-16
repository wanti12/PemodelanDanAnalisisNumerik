package soalArray2;

import java.util.Scanner;

public class dua {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();

        int a[] = new int[n];

        int max = Integer.MIN_VALUE;
        int maxkedua = Integer.MIN_VALUE;
        System.out.println("input elemen: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();
            if (a[i] > max) {
                max = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxkedua && a[i] < max) {
                maxkedua = a[i];
            }
        }

        System.out.println("terbesar kedua = " + maxkedua);
    }
}
