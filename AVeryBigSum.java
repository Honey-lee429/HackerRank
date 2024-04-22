package br.com.alura.screenmatch.principal;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {
        return ar.stream().reduce(0L, Long::sum);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        var sizeList = scanner.nextInt();
        ArrayList<Long> ar = new ArrayList<>();

        for (int i = 0; i < sizeList; i++) {
            var l = scanner.nextLong();
            ar.add(l);
        }

        var result = aVeryBigSum(ar);
        System.out.println(result);


    }


}
