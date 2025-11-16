package soalArray2;

import java.util.Scanner;

public class satu {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();

        int a[] = new int[n];

        int jgenap = 0;
        int jganjil = 0;
        System.out.println("input elemen array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();

            if (a[i] % 2 == 0) {
                jgenap++;
            } else {
                jganjil++;
            }

        }

        System.out.println("Jumlah bilangan genap = " + jgenap);
        System.out.println("Jumlah bilangan ganjil = " + jganjil);

    }

}
//tidak selesai