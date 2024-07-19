import java.util.Scanner;

public class Exercise1 {
    // Question 1: ENter 3 numbers from the user and print their average.
    // public static void average(int num1, int num2, int num3) {
    // int __sum = num1 + num2 + num3;
    // System.out.println("The avergae is: " + __sum / 3);
    // }

    // Question2: Write a function to print the sum of all odd numbers from 1 to n.

    // public static void sumOddNumbers(int num) {
    // int sum = 0;
    // for (int i = 1; i <= num; i++) {
    // if (i % 2 != 0) {
    // sum += i;
    // }

    // }
    // System.err.println("The sum of Odd numbers is: " + sum);

    // }

    // Question3: Write a function which takes in 2 numbers and returns the greater
    // of those.
    // public static void greater(int num1, int num2) {
    // if (num1 > num2) {
    // System.err.println("The greater number is: " + num1);
    // } else {
    // System.err.println("The greater number is: " + num2);
    // }
    // }

    // Question4: Write a function that takes in radius as input and returns the
    // circumference of the circle.
    // public static void circumference(int radius) {
    // double circ = 2 * 3.14159 * radius;
    // System.err.println("The circumference is: " + circ);
    // }

    // Question5: Write a function that takes a person's age and check for their
    // vote eligibility.
    // public static void voteEligibility(int age) {
    // if (age > 18) {
    // System.out.print("You are eligible to vote!");
    // } else {
    // System.err.println("You are not eligible to vote!");
    // }
    // }

    // Question6: Write an infinite loop using do while condiiton.
    // public static void infiniteLoop() {
    // int i = 0;
    // do {
    // System.out.println("This is funnn!!!!!!!");

    // } while (i == i);
    // }

    // Question7: Write a program to enter a number as the user wants and at the end
    // return the number of
    // positive and negative and zeros entered.
    // public static void numbers(int limit) {
    // Scanner sc = new Scanner(System.in);
    // int positive = 0;
    // int negative = 0;
    // int zeros = 0;
    // for (int i = 1; i <= limit; i++) {
    // System.out.println("Number of truns left: " + ((limit - i) + 1));
    // System.out.println();
    // System.out.print("Enter a number: ");
    // int num = sc.nextInt();
    // if (num > 0) {
    // positive += 1;
    // } else if (num == 0) {
    // zeros += 1;
    // } else if (num < 0) {
    // negative += 1;
    // }

    // }
    // System.out.println();
    // System.out.println("The number of Zeros entered: " + zeros);
    // System.out.println("The number of positives entered: " + positive);
    // System.out.println("The number of negatives entered: " + negative);
    // }

    // Question8: Write a program to take two numers 'x' and 'n'.
    // Print the value of x raised to the power of n.

    // public static void power(int x, int n) {
    // int val = 1;
    // for (int i = 1; i <= n; i++) {
    // val *= x;
    // }
    // System.out.println(val);
    // }

    // Question9: Write a function that calculates the greatest common divisor of
    // two numbers.
    // public static void gcd(int num1, int num2) {
    // int limit = 0;
    // int gcd = 1;
    // if (num1 > num2) {
    // limit = num2;
    // } else {
    // limit = num1;
    // }
    // for (int i = 1; i <= limit; i++) {
    // if (num1 % i == 0 && num2 % i == 0) {
    // gcd = i;
    // }

    // }
    // System.out.println("The GCD is: " + gcd);

    // }

    // Question10: Write a program to print Fibonacci series of n terms where n is
    // input by user.
    public static int fibonacci(int num) {
        if (num <= 1) {
            return 1;
        }
        return fibonacci(num - 2) + fibonacci(num - 1);

    }

    public static void main(String[] args) {
        // System.out.println("Enter the limit you want for entering numbers: ");
        // //related to question7.
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        System.out.println(fibonacci(num1));

    }
}
