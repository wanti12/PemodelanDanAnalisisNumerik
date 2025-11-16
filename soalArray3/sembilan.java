package soalArray3;

import java.util.Scanner;

public class sembilan {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = wa.nextInt();
            c[i] = a[i] + b[i];
            System.out.print(c[i] + " ");
        }
        System.out.println("");

    }

}
