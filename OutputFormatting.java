package br.com.alura.screenmatch.principal;

import java.util.Scanner;

public class HackerHank {

    public static void main(String[] args) {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            var s = scanner.next();
            var n = scanner.nextInt();

            System.out.printf("%-15s %03d%n", s, n);
        }
        System.out.println("================================");
        scanner.close();
        //bufferedReader.close(); // Close the Scanner to prevent resource leak
    }

    /*Sample Input
    * java 100
      cpp 65
      python 50
        * 
        * 
        * 
    * Sample Output
        ================================
        java           100 
        cpp            065 
        python         050 
        ================================
    * */
}
