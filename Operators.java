import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Operators {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
          var totalCoat = Math.round(meal_cost + (tip_percent*(meal_cost/100)) + (tax_percent*(meal_cost/100)));
          System.out.println(totalCoat);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Operators.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }

  /* Scanner scanner = new Scanner(System.in);
        var mealCost = scanner.nextDouble();
        var tipPercent = (scanner.nextDouble() / 100) * mealCost;
        var taxPercent = (scanner.nextDouble() / 100) * mealCost;
        var totalCoat = Math.round(mealCost + tipPercent + taxPercent);

        System.out.println(totalCoat);*/
}
