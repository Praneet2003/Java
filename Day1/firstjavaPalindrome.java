// public class first {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }// You are using Java
import java.util.Scanner;//library having many function like Scanner class.
// import java.util.*;
public class firstjavaPalindrome{
    public static void main(String args[]){//similar to main function in c++.
        System.out.println("Hello World!!");
        System.out.println("Enter the number to check Palindrome: ");
        Scanner sc = new Scanner(System.in);//object of Scanner class, helping us to take input from user.
        int a = sc.nextInt();
        // System.out.println(a);
        int orignal = a;
        int check =0;
        while(a!=0){
            int t = a%10;
            int i=0;
            check = check*10+t;
            i++;
            a/=10;
        }
        if(orignal==check){
            System.out.println("The number is a Palindrome");
        }else{
            System.out.println("The number is not a Palindrome");
        }
    }
}