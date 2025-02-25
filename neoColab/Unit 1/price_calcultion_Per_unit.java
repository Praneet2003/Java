// Rakshan is given an integer N as input, representing the number of electricity units consumed, he wants to calculate the total electricity bill based on the following conditions:
// For the first 50 units, the cost is Rs. 0.50 per unit.
// For the next 100 units (51 to 150), the cost is Rs. 0.75 per unit.
// For the next 100 units (151 to 250), the cost is Rs. 1.20 per unit.
// For units above 250, the cost is Rs. 1.50 per unit.
// An additional surcharge of 20% is added to the total bill. Your task is to guide him in the program.
// Input format :
// The input consists of an integer N, representing the number of electricity units consumed.

// Output format :
// The output prints a double value, representing the total electricity bill, rounded off to two decimal places.
// Refer to the sample output for formatting specifications.

// Code constraints :
// 25 ≤ N ≤ 1000

// Sample test cases :
// Input 1 :
// 225
// Output 1 :
// 228.00
// Input 2 :
// 300
// Output 2 :
// 354.00
// Input 3 :
// 150
// Output 3 :
// 120.00
import java.util.*;
class price_calcultion_Per_unit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double cost = 0;
        if(n>250){
            cost+=(n-250)*1.50;
            n = 250;
        }
        if(n>150){
            cost+=(n-150)*1.20;
            n = 150;
        }
        if(n>50){
            cost+=(n-50)*0.75;
            n = 50;
        }
        cost+=n*0.50;
        cost+=cost*0.2;
        System.out.printf("%.2f",cost);
    }
}