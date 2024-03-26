import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Task
 * Given a string, S, of length N that is indexed from 0 to , N-1 print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).
 * <p>
 * Note:  is considered to be an even index.
 * <p>
 * Sample Input
 * <p>
 * 2
 * Hacker
 * Rank
 * Sample Output
 * <p>
 * Hce akr
 * Rn ak
 */

/*Digitar quantos contatos que verificar
 * digitar o nome do contato e numero
 * devolver nome=numero se houver na lista
 * devolver not found se não houver na lista
 * */

public class DictionariesMaps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var print = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> phoneBook = new HashMap<>();
        // incluir contatos no map
        for (int i = 0; i < print; i++) {
            var nome = scanner.next();
            var tel = scanner.nextInt();
            phoneBook.put(nome, tel);
            //System.out.println(phoneBook);
        }

        while (scanner.hasNext()) {
            var next = scanner.next();
            if (phoneBook.containsKey(next)) {
                System.out.println(next + "=" + phoneBook.get(next));
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();
    }
}





