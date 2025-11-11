import java.util.*;

public class Right_Half_Pyramid {
    public static void printRightHalfPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        printRightHalfPyramid(n);
        sc.close();
    }
}
