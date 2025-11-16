package soalArray2;

import java.util.Scanner;

public class empat {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int n = wa.nextInt();

        int a[] = new int[n];

        int pos = 0;
        int nev = 0;
        int nol = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = wa.nextInt();

            if (a[i] > 0) {
                pos++;
            } else if (a[i] < 0) {
                nev++;
            } else {
                nol++;
            }

        }
        
        System.out.println("Positif = "+pos);
        System.out.println("negatif = "+nev);
        System.out.println("nol= "+nol);
    }

}
