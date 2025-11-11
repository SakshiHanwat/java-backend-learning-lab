/*POD 5. Program for Armstrong Numbers

Given a number x, determine whether the given number is Armstrong's number or not. 
A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if

abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....

Here a, b, c and d are digits of input number abcd.....

Examples

Input: n = 153
Output: true
Explanation: 153 is an Armstrong number, 111 + 555 + 333 = 153

Input: n = 9474
Output: true
Explanation: 94 + 44 + 74 + 44 = 6561 + 256 + 2401 + 256 = 9474

Input: n = 123
Output: false
Explanation: 1³ + 2³ + 3³ = 1 + 8 + 27 = 36*/
import java.util.*;

public class ArmStrong {

    public static void isArmStrong(int num) {

        int original = num;

        int count = 0;
        int temp =num;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int sum = 0;
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }

        // result check
        if (sum == original)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is NOT an Armstrong number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        isArmStrong(num); 
    }
}
