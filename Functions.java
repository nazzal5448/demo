import java.util.Scanner;

public class Functions {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int factorial(int num) {
        if (num < 0) {
            System.out.println("Invalid Number ----> " + num);
            return num * 0;
        }
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // try (Scanner sc = new Scanner(System.in)) {
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum_ = sum(a, b);
        // System.out.println("The sum is: " + sum_);
        // }

        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.println("The Factorial is ----> " + factorial(num));
        }
    }
}
