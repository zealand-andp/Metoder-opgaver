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

        // Test case hvor midterste værdi er midterst
        // Input: a = 10, b = 25, c = 50
        // Forventet output: 25

    }
}
