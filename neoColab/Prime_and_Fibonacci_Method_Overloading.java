// Anu is tasked with creating a program to determine whether a given number or a range of numbers falls into one of two categories: prime numbers or Fibonacci numbers. There are two constructors to achieve this task:

// Single Number Checker

// Constructor: PrimeFibonacciChecker(int number, String type)

// Input: A single integer number and a type ("prime" or "fibonacci").

// Output: Determine if the provided number is a prime number or part of the Fibonacci series.

// Range Checker

// Constructor: PrimeFibonacciChecker(int start, int end, String type)

// Input: A range of integers defined by a start and end value, along with a type ("prime" or "fibonacci").

// Output: Find all numbers within the given range that are prime numbers or part of the Fibonacci series.

// Input format :
// The first line contains either a single integer x (for a single number check) or two integers start and end separated by a space (for a range check).

// The second line contains a string type, which can be either "prime" or "fibonacci," indicating the type of check to perform.

// Output format :
// For a single number check:

// If the type is "prime," the program outputs whether the given number is a prime number or not. If the type is "fibonacci," the program outputs whether the given number is part of the Fibonacci series or not.

// For a range check:

// If the type is "prime," the program outputs all prime numbers within the specified range. If the type is "fibonacci," the program outputs all Fibonacci numbers within the specified range.

// If an invalid type is specified, the program outputs "Invalid."

// Code constraints :
// 1 ≤ x ≤ 100



// Note: Refer to the sample output for the format specification.

// Sample test cases :
// Input 1 :
// 41
// prime
// Output 1 :
// 41 is a prime number.
// Input 2 :
// 17
// fibonacci
// Output 2 :
// 17 is not part of the Fibonacci series.
// Input 3 :
// 10 20
// prime
// Output 3 :
// Prime numbers in the range e 10 to 20: [11, 13, 17, 19]
// You are using Java
import  java.util.*;
class PrimeFibonacciChecker {
    //type your code here
    public PrimeFibonacciChecker(int n, String s){
        int flag = 1;
        if(s.equalsIgnoreCase("Prime")){
            if(n==2){
                flag = 1; 
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    flag = 0;
                    break;
                }
            }
            if(flag==1){
                System.out.printf("%d is a prime number.",n);
            }else{
                System.out.printf("%d is not a prime number.",n);
            }
        }else if(s.equalsIgnoreCase("Fibonacci")){
            int n1 = 5*n*n + 4;
            int n2 = 5*n*n - 4;
            if(perfectSquare(n1)||perfectSquare(n2)){
                System.out.printf("%d is a part of the Fibonacci series.",n);
            }else{
                System.out.printf("%d is not part of the Fibonacci series.",n);
            }
        }else{
            System.out.println("Invalid.");
        }
    }
    public boolean perfectSquare(int n){
        int sqrt = (int) Math.sqrt(n);
        return sqrt*sqrt ==n;
    }
    public boolean isPrime(int n){
        int flag = 1;
        for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
            }
        }
        return true;
    }
    public PrimeFibonacciChecker(int start,int end,String s){
        if(s.equalsIgnoreCase("prime")){
        int arr[] = new int[end-start];
        int su=0;
        System.out.printf("Prime numbers in the range %d to %d :",start,end);
        for(int i=start;i<end;i++){
            if(isPrime(i)){
                arr[su] = i;
                su++;
            }
        }
        for(int i=0;i<su;i++){
            if(i==0){
                System.out.print(" ["+arr[i]+", ");
            }if(i>0 && i< su-1){
                System.out.print(arr[i]+", ");
            }if(i==su-1){
                System.out.print(arr[i]+"]");
            }
            }
        }else if(s.equalsIgnoreCase("Fibonacci")){
            int a =0,b = 1;
            int arr[] = new int[end-start];
            int su =0;
            System.out.printf("Fibonacci numbers in the range %d to %d :",start,end);
            while(a<=end){
                if(a>=start){
                    arr[su]=a;
                    su++;
                }
                int next = a+b;
                a=b;
                b = next;
            }
            for(int i=0;i<su;i++){
                if(i==0){
                System.out.print(" ["+arr[i]+", ");
            }if(i>0 && i< su-1){
                System.out.print(arr[i]+", ");
            }if(i==su-1){
                System.out.print(arr[i]+"]");
            }
            }
        }
    }
}
public class Prime_and_Fibonacci_Method_Overloading{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        String typeInput;
        if (parts.length == 1) {
            typeInput = scanner.nextLine();
            int numberInput = Integer.parseInt(parts[0]);
            new PrimeFibonacciChecker(numberInput, typeInput);
        } else if (parts.length == 2) {
            typeInput = scanner.nextLine();
            int startInput = Integer.parseInt(parts[0]);
            int endInput = Integer.parseInt(parts[1]);
            new PrimeFibonacciChecker(startInput, endInput, typeInput);
        } else {
            System.out.println("Invalid input format.");
        }

        scanner.close();
    }
}
