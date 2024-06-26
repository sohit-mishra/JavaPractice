package Day1;
import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);

        System.out.print("Hello World it is first\n Language");
        System.out.println("Hello World it is first Language 1");
        System.out.print("Hello World it is first Language 2");

        int m = 10;
        int n = 100;
        int c = 10;
        int d = 30;
        int solve = n - m / c + d;
        int solve1 = (n - m) / (c + d);
        System.out.println(solve);
        System.out.println(solve1);

        String aq = "Hello World";
        System.out.println(aq);

        if (50 < 60) {
            System.out.println("50 is smaller than 60");
        } else {
            System.out.println("60 is greater than 50");
        }

        String result = 50 < 60 ? "Equal" : "Not Equal";
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        String ab = scanner.nextLine();
        System.out.println(ab);

        for (int i = 0; i < args.length; i++) {
            System.out.println("x");
        }
    }
}