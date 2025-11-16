package soalArray2;

import java.util.Scanner;

public class tujuh {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);

        int n = wa.nextInt();

        int a[] = new int[n];

        boolean kondisi = true;
        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();
        }

        int x = a[0];
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                if (x >= a[i]) {
                    kondisi = false;

                }
            }
            x = a[i];

        }

        if (kondisi) {
            System.out.println("Array sudah terurut naik");
        } else {
            System.out.println("Array belum terurut naik.");
        }
    }

}

