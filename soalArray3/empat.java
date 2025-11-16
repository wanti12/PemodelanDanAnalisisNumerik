package soalArray3;

import java.util.Scanner;

public class empat {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);

        int n = wa.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();
        }
        int x = wa.nextInt();
        int jml = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                jml++;
            }
        }

        System.out.println(jml);
    }

}
