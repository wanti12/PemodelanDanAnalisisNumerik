package soalArray2;

import java.util.Scanner;

public class tiga {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();

        }
        int x = wa.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

}
