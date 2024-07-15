import java.util.*;

public class Quiz1 {
    public static void main(String[] args) {
        // try (Scanner sc = new Scanner(System.in)) {
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a +
        // System.out.println(sum);
        // }

        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if (age >= 18) {
        // System.out.println("Congratss!! You have passed the age limit.");
        // } else {
        // System.out.println("Sorrryy!! You are not eligible.");
        // }

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // if (num % 2 == 0) {
        // System.out.println("This is an even number!");

        // } else {
        // System.out.println("This is an odd number!");
        // }

        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();
            switch (button) {
                case 1:
                    System.out.println("Namaste");
                    break;

                case 2:
                    System.out.println("Hello");
                    break;

                case 3:
                    System.out.println("Bonjour");
                    break;

                default:
                    System.out.println("Invalid Button!!");
            }
        }
    }
}
