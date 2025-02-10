// // You are using Java
// A prominent real estate agency, 'EstatePro', is streamlining its customer service by automating lease calculations and payment method suggestions. As a software developer, your mission is to create a program that will calculate the total cost of leasing a property based on the monthly rent and the duration of the lease in months. 
// Additionally, provide payment method suggestions to the customers, using a 'switch-case' statement.
// If the total cost is less than or equal to 1000, suggest payment by cash or check.
// If the total cost is between 1000 and 5000 (inclusive), suggest payment by credit card.
// If the total amount is over 5000, suggest payment by bank transfer.
// Input format :
// The first line of input consists of an integer, representing the monthly rent.
// The second line consists of an integer, representing the lease duration.
// Output format :
// The first line of output prints "Total Cost: " followed by an integer, representing the total cost of the lease.
// The second line prints "Payment Method Suggestion: " followed by a string representing the payment method suggestion.
// Refer to the sample output for the exact text and format.
// Code constraints :
// 1 ≤ monthly rent ≤ 10,000
// 1 ≤ lease duration ≤ 36
// Sample test cases :
// Input 1 :
// 500
// 12
// Output 1 :
// Total Cost: 6000
// Payment Method Suggestion: Payment by bank transfer is recommended.
// Input 2 :
// 800
// 3
// Output 2 :
// Total Cost: 2400
// Payment Method Suggestion: Payment by credit card is recommended.
// Input 3 :
// 150
// 5
// Output 3 :
// Total Cost: 750
// Payment Method Suggest
import java.util.Scanner;

public class SwitchCase{
public static void main(String[] args) {
        //type your code here
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int res = a*b;
        System.out.println("Total Cost: "+res);
        System.out.print("Payment Method Suggestion: ");
        int category=0;
        if(res<=1000){
            category = 1;
        }else if(res>=1000 && res <=5000){
            category = 2;
        }else if(res>5000){
            category = 3;
        }
        switch(category){
            case 1:
                System.out.println("Payment by cash or check is recommended.");
                break;
            case 2:
                System.out.println("Payment by credit card is recommended.");
                break;
            case 3:
                System.out.println("Payment by bank transfer is recommended.");
                break;
            default:
                System.out.println("Default");
        }
    }
}