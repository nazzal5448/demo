
public class Patterns {
    public static void main(String[] args) {
        // String pattern = "*";
        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j < 5; j++) {
        // System.out.print(pattern);
        // }
        // System.out.println("\n");
        // }

        // int n = 4;
        // int m = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || i == n || j == 1 || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }

        // }
        // System.out.println();
        // }

        // int n = 4;
        // for (int i = 1; i <=n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // int n = 5;
        // int x = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(x);
        // x++;
        // }
        // System.out.println();
        // }

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }
}
