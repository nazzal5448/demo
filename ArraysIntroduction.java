import java.util.Scanner;

public class ArraysIntroduction {
    public static void main(String[] args) {
        // int[] arr = new int[3];
        // arr[0] = 23;
        // arr[1] = 24;
        // arr[2] = 8;

        // int arr[] = { 34, 56, 7, 88, 90 };
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int arr1[] = new int[size];
        // for (int i = 0; i < size; i++) {
        // System.out.println(arr1[i]);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number to input at index " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search: ");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        for (int i = 0; i < size; i++) {
            if (num == arr[i]) {
                System.out.println("Number found at index " + i);
                return;
            }
        }
        System.out.println("Number not found!!");

    }
}
