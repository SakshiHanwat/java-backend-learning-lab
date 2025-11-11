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