package soalArray2;

import java.util.Scanner;

public class sembilan {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();

        boolean kondisi = false;
        int x = 0;
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();
        }
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] == a[x]) {
                kondisi = true;
            }
        }

        if (kondisi) {
            System.out.println("Array adalah palindrom.");
        } else {
            System.out.println("Array bukan palindrom.");

        }

    }

}
