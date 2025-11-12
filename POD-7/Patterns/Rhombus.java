import java.util.*;

public class Rhombus{
    public static void Rhombus_Pattern(int n){
        
            for (int i = 1; i <= n; i++) {
            // print spaces
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int n = sc.nextInt();

        Rhombus_Pattern(n);
    }
}