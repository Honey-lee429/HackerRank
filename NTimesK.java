public class NTimesK {
    private static int nTimesK(int n, int k) {
        System.out.println("n: " + n);
        if (n > 1) {
            return k + nTimesK(n - 1, k);
        } else {
            return k;
        }
    }

    public static void main(String[] args) {

        int result = nTimesK(3, 4);
        System.out.println("Result: " + result);
    }
}
