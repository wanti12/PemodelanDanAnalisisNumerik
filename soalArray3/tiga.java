package soalArray3;

import java.util.Scanner;

public class tiga {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();

        int a[] = new int[n];
        int jumlahGenap = 0;
        int jumlahGanjil = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();

            if (a[i] % 2 == 0) {
                jumlahGenap++;
            } else {
                jumlahGanjil++;
            }
        }
        System.out.println(jumlahGenap + " " + jumlahGanjil);
    }

}
