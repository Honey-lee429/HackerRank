package br.com.alura.screenmatch.principal;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    public static int simpleArraySum(List<Integer> ar) {
        return ar.stream().reduce(0, Integer::sum);
        // int result = 0;
        // for (var number : ar) {
        // result+=number;
        //}
        // return result;

    }

}

public class ListSum {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        var tamanhoArray = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
      
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //var tamanhoArray = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < tamanhoArray; i++) {
            var num = scanner.nextInt();
            arr.add(num);

//            var num = Stream.of(bufferedReader.readLine()
//                            .replaceAll("\\s+$", "")
//                            .split(" "))
//                    .collect(Collectors.toUnmodifiableList());
//                    //.map(Integer::parseInt).toList();

        }
        var soma = Result.simpleArraySum(arr);
        System.out.println(soma);
    }
}
