package soalArray3;

import java.util.Scanner;

public class lima {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();
        int a[] = new int[n];

        int x = a[0];
        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
            System.out.print(a[i] + " ");
        }

        System.out.println("");
    }

}
