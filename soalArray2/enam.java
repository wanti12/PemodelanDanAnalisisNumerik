package soalArray2;

import java.util.Scanner;

public class enam {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            int p = wa.nextInt();
            a[i] = p;
        }
        for (int j = 0; j < b.length; j++) {
           
            b[j] = wa.nextInt();
        }

        int k = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                k++;
            }
        }

        if (k == a.length) {
            System.out.println("identik");
        } else {
            System.out.println("tidak identik");
        }
    }

}

