package dk.docjava.grundlaeggende_programmering.metoder;

public class Opgave3 {
    /* Lav en metode midterst, der tager tre tal som parametre.
    Metoden skal returnere den midterste værdi.
    F.eks. skal kaldet midterst( 6, 10, 8 ) returnere 8. */

    public static void main(String[] args) {
	    // Test case hvor sidste værdi er midterst
        // Input: a = 6, b = 10, c = 8
        // Forventet output: 8

        // Input
        int a = 6;
        int b = 10;
        int c = 8;

        int output = midterst(a, b, c);

        // Sammenligning med forventet output
        if (output == 8)
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        // Test case hvor første værdi er midterst
        // Input: a = 3, b = 7, c = 2
        // Forventet output: 3

        // Input
        a = 3;
        b = 7;
        c = 2;

        output = midterst(a, b, c);

        // Sammenligning med forventet output
        if (output == 3)
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        // Test case hvor midterste værdi er midterst
        // Input: a = 10, b = 25, c = 50
        // Forventet output: 25

        // Input
        a = 10;
        b = 25;
        c = 50;

        output = midterst(a, b, c);

        // Sammenligning med forventet output
        if (output == 25)
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        // Test case hvor midterste værdi er midterst
        // Input: a = 6, b = 6, c = 10
        // Forventet output: 6

        // Input
        a = 6;
        b = 6;
        c = 10;

        output = midterst(a, b, c);

        // Sammenligning med forventet output
        if (output == 6)
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        // Test case hvor midterste værdi er midterst
        // Input: a = 6, b = 10, c = 6
        // Forventet output: 6

        // Input
        a = 6;
        b = 10;
        c = 6;

        output = midterst(a, b, c);

        // Sammenligning med forventet output
        if (output == 6)
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        // Test case hvor midterste værdi er midterst
        // Input: a = 10, b = 6, c = 6
        // Forventet output: 6

        // Input
        a = 10;
        b = 6;
        c = 6;

        output = midterst(a, b, c);

        // Sammenligning med forventet output
        if (output == 6)
            System.out.println("PASS");
        else
            System.out.println("FAIL");

    }

    static int midterst(int a, int b, int c) {
        if (a <= b && b < c || a > b && b > c) {
            System.out.println(b);
            return b;
        } else if (b <= a && a < c || b > a && a > c) {
            System.out.println(a);
            return a;
        } else {
            System.out.println(c);
            return c;
        }

    }
}
