/*POD 4. Factorial of a Number

Given the non-negative integers n , compute the factorial of a given number.
Note: Factorial of n is defined as n * (n -1) * (n - 2) * ... * 1, for n = 0, factorial is 1.

Examples:

Input: n = 5
Output: 120
Explanation: 5! = 5 * 4 * 3 * 2 * 1 = 120

Input: n = 4
Output: 24
Explanation: 4! = 4 * 3 * 2 * 1 = 24
 */

import java.util.*;
public class Factorial{

    public static void checkFactorial(int n){
            if(n==1){
                System.out.println("Factorial of "+n+ " is "+n);
            }else{
                int fact= 1; 
                for(int i = 2; i<=n; i++){

                fact =fact*i;
                }   
                System.out.println("Factorial of "+n+" is "+fact);

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        checkFactorial(n);
        
    }
}