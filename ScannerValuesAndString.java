package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.util.Scanner;


public class ScannerValuesAndString {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        var b1 = scanner.nextInt();
        var i = 4;

        scanner.nextLine(); // Na leitura consecutiva de valores numéricos e String deve-se esvaziar o buffer do
//teclado antes da leitura do valor String -> scanner.nextLine(); // esvazia o buffer do teclado
        var b3 = scanner.nextLine();
        var s = "HackerRank";

        var b2 = scanner.nextDouble();
        var d = 4.0;

        System.out.println(b1 + i);
        System.out.println(b2 + d);
        System.out.println(s + " " + b3);

        scanner.close();


    }

}



