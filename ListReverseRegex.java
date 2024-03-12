import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListReverseRegex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementos = scanner.nextInt();
        //ArrayList[] lista = new ArrayList[10]; quando precisa incluir lista dentro da lista
        ArrayList<Integer> lista = new ArrayList<>(1000);

        for (int i = elementos; i > 0; i--) {
            int d = scanner.nextInt();
            lista.add(d);
        }
   

        Collections.reverse(lista);
        System.out.println(lista.toString().replaceAll("[,\\[\\]]", ""));
        scanner.close();

    }

    /*
    * Sample Input
        4
        1 4 3 2
      Sample Output
        2 3 4 1
    *
    * */

}



