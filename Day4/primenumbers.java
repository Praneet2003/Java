// // You are using Java
// Problem Statement



// Arun is tasked with creating a program that prints prime numbers within a given range. The program should take two integers, start and end, as input, and output the prime numbers between these two values (inclusive).



// Can you help him in creating the program?

// Input format :
// The input consists of two space-separated integers L and U, representing the starting range and ending range of the prime numbers.

// Output format :
// The output prints the prime numbers from the given starting range to the ending range separated by space.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ L, U ≤ 150

// L < U

// Sample test cases :
// Input 1 :
// 1 23
// Output 1 :
// 2 3 5 7 11 13 17 19 23 
// Input 2 :
// 23 69
// Output 2 :
// 23 29 31 37 41 43 47 53 59 61 67
import java.util.Scanner;
class primenumber{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int s = obj.nextInt();
        int e = obj.nextInt();
        for(int i=s;i<=e;i++){
            if(i<=1){
                continue;
            }
            boolean isPrime = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
}