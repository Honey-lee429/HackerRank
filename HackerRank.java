import java.io.IOException;
import java.util.Scanner;

public class HackerHank {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        var x = sc.nextLong();


        for (int i = 0; i < x; i++) {
            try {
                long s = sc.nextLong();
                System.out.println(s + " can be fitted in:");

                if (s >= -128 && s <= 127) {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (s >= -32768 && s <= 32767) {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (s >= -2147483648 && s <= 2147483647) {
                    System.out.println("* int");
                    System.out.println("* long");

                } else if (s >= -9223372036854775808L && s <= 9223372036854775807L) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

        /* Expected Output
        -150 can be fitted in:
        * short
        * int
        * long
        150000 can be fitted in:
        * int
        * long
        1500000000 can be fitted in:
        * int
        * long
        213333333333333333333333333333333333 can't be fitted anywhere.
        -100000000000000 can be fitted in:
        * long
        */

    }
}
