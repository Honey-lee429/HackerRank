import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HackerRank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe a quantidade de linhas: ");
        int quantidadeLinha = scanner.nextInt();
        int i;
        int j;
        ArrayList[] lista = new ArrayList[20000];

        for (i = 0; i < quantidadeLinha; i++) {
            System.out.println("informe a quantidade de numeros no array: ");
            lista[i] = new ArrayList();
            int quantidadeNumeroNoArray = scanner.nextInt();
            for (j = 0; j < quantidadeNumeroNoArray; j++) {
                System.out.println("digite um numero");
                int n = scanner.nextInt();
                lista[i].add(n);

            }

        }
        System.out.println("numero de query");
        int query = scanner.nextInt();
        for (int i1 = 0; i1 < query; i1++) {
            var linha = scanner.nextInt();
            var coluna = scanner.nextInt();
            try {
                System.out.println(lista[linha - 1].get(coluna - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        System.out.print(Arrays.deepToString(lista));


    }

        /*Sample Input
        *
        *   5
            5 41 77 74 22 44
            1 12
            4 37 34 36 52
            0
            3 20 22 33
            5
            1 3
            3 4
            3 1
            4 3
            5 5
            *
            *
            *
            * Sample Output
            *
            *   74
                52
                37
                ERROR!
                ERROR!*/

}



