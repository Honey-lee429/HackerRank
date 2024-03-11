import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe a quantidade de linhas: ");
        int quantidadeLinha = scanner.nextInt();
        int i;
        int j;
        List<Integer> lista = new ArrayList<>();

        for (i = 0; i < quantidadeLinha; i++) {
            System.out.println("informe a quantidade de numeros no array: ");
            List<Integer> l = new ArrayList<>();
            int quantidadeNumeroNoArray = scanner.nextInt();
            for (j = 0; j < quantidadeNumeroNoArray; j++) {
                System.out.println("digite um numero");
                int n = scanner.nextInt();
                l.add(n);
                lista.addAll(l);

                }

            }
        System.out.print(lista);


        System.out.println("informe query");
        int query = scanner.nextInt();
        for (int m = 0; m < query; m++) {
            var linha = scanner.nextInt();
            for (int o = 0; o < linha; o++) {
                var coluna = scanner.nextInt();
                // [1,2] [3,6]
                lista.get(linha);
                lista.get(coluna);
            }
            System.out.println(lista);
        }


        }

    }



