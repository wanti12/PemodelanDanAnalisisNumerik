package soalArray3;

import java.util.Scanner;

public class tujuh {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();

        int a[] = new int[n];

        boolean kondisi = true;
        int c = a.length;
        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();

            if (a[i] == a[c - 1]) {
                kondisi = true;
            } else {
                kondisi = false;
            }
            c--;
        }

        if (kondisi) {
            System.out.println("IYA");
        } else {
            System.out.println("TIDAK");
        }
    }

}
