import java.util.Scanner;

/**
 * Task
 * Given a string, S, of length N that is indexed from 0 to , N-1 print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).
 * <p>
 * Note:  is considered to be an even index.
 *
 *      Sample Input
 *
 * 2
 * Hacker
 * Rank
 *      Sample Output
 *
 * Hce akr
 * Rn ak
 */


public class StringIndexEvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var i = scanner.nextInt();
        scanner.nextLine();


        for (int j = 0; j < i; j++) {
            var myChar = scanner.next();
            StringBuilder sE = new StringBuilder();
            //var sO = "";
            StringBuilder sO = new StringBuilder();
            for (int k = 0; k < myChar.length(); k++) {
                var even = k % 2 == 0;
                if (even) {
                    sE.append(myChar.charAt(k));

                } else {
                    sO.append(myChar.charAt(k));
                }
            }
            System.out.print(sE + " " + sO);
            System.out.println();
        }


    }

}



