import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        var s = Integer.parseInt(bufferedReader.readLine());
        boolean even = s % 2 == 0;
        var odd = s % 2 != 0;
        if (odd) {
            System.out.println("Weird");
        } else if (even && s >= 2 && s <= 5) {
            System.out.println("Not Weird");
        } else if (even && s >= 6 && s <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        bufferedReader.close();
    }
}
