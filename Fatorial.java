package br.com.alura.screenmatch.principal;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fatorial {
    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);

        } else {
            return 1;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Fatorial.factorial(n);

        System.out.println(result);
        bufferedReader.close();
    }


//        Scanner scanner = new Scanner(System.in);
//        var num = scanner.nextInt();
//        var times = 1;
//
//        for (int i = num; i > 0; i--) {
//            times*=i;
//        }
//        System.out.println(times);

}










