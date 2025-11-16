package soalArray3;

import java.util.Scanner;

public class satu {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();

        int a[] = new int[n];
        int jumlah = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();
            jumlah += a[i];
        }

        System.out.println(jumlah);
    }

}
