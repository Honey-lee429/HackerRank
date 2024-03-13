import java.util.Scanner;

/**
 * Sample Input
 * <p>
 * 4
 * -1
 * 10
 * 16
 * 18
 * Sample Output
 * <p>
 * Age is not valid, setting age to 0.
 * You are young.
 * You are young.
 * <p>
 * You are young.
 * You are a teenager.
 * <p>
 * You are a teenager.
 * You are old.
 * <p>
 * You are old.
 * You are old.
 */


public class ClassXInstance
 {

    private int age;

    public HackerRank(int initialAge) {

        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else if (this.age >= 13 && this.age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        this.age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            ClassXInstance p = new ClassXInstance(age);
            p.age = age;
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }


}

