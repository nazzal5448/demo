
import java.util.*;

public class Class4 {
    public static void main(String[] args) {
        // for (int i = 0; i < 10; i++) {
        // System.out.println(i + 1 + " Hello World!!");
        // }

        try (// int i = 0;
             // // while (i < 11) {
             // // System.out.println(i);
             // // i++;
             // // }
             // do {
             // System.out.println(i);
             // i++;
             // } while (i < 11);
                Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            for (int i = 1; i <= 16; i++) {
                System.out.println(i * num);
            }
        }
    }
}
