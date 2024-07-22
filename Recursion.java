public class Recursion {
    public static void printNumbers(int n) {
        System.out.println(n);
        if (n == 1) {
            return;
        }
        printNumbers(n - 1);

    }

    public static void recursion1(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        recursion1(n - 1);
        System.out.println(n);
    }

    public static int sumNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + sumNaturalNumbers(n - 1);
        return sum;
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);

    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static int xPowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return xPowerN(x, n / 2) * xPowerN(x, n / 2);
        } else {
            return xPowerN(x, n / 2) * xPowerN(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(xPowerN(2, 5));

    }
}