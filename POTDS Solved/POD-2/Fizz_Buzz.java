/*Given an integer n, for every positive integer i <= n, the task is to print,

"FizzBuzz" if i is divisible by 3 and 5,
"Fizz" if i is divisible by 3,
"Buzz" if i is divisible by 5
"i" as a string, if none of the conditions are true.
Examples:

Input: n = 3
Output: ["1", "2", "Fizz"]

Input: n = 10
Output: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

Input: n = 20
Output: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"]
 */

 import java.util.*;

 public class Fizz_Buzz{
    public static void PrintFizzBuzz(int n){
        for(int i = 1; i<=n; i++){
            if(i%3== 0 && i%5==0){
                System.out.print(" FizzBuzz");
            }else if(i%3==0){
                System.out.print(" Fizz");
            }
            else if(i%5==0){
                System.out.print(" Buzz");
            }
            else{
                System.out.print(" "+i);
            } 
        }
    }
        public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
            
        PrintFizzBuzz(n);

    }
 }