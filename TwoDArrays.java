import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        int arr[][] = new int[3][5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the nuumber of coulumns");
        int cols = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the number to put at index " + i + "x" + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number you want to search: ");
        int num = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == num) {
                    System.out.println("Number found at index " + i + "x" + j);
                    return;
                }
            }

        }
        System.out.println("Number Not Found!!!");
    }
}
