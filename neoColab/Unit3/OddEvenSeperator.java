// Alice is developing a new sorting algorithm and needs assistance in testing it. The algorithm processes an array of integers and separates them into two distinct arrays: one containing odd numbers and the other containing even numbers. Both subsets must preserve the original order of appearance from the input array.



// To achieve this, she decides to use an abstract class that defines a method for sorting numbers into odd and even categories.

// Input format :
// The first line consists of an integer, n, representing the number of elements in the array.

// The next n lines contain the elements of the array.

// Output format :
// The first line displays the sorted odd numbers as a comma-separated array enclosed in square brackets.

// The second line displays the sorted even numbers as a comma-separated array enclosed in square brackets.



// Refer to the sample output for the formatting specifications.

// Code constraints :
// 0 ≤ n ≤ 100

// -106 ≤ element ≤106

// Sample test cases :
// Input 1 :
// 6
// 9
// 2
// 4
// 7
// 12
// 15
// Output 1 :
// Sorted Odd Numbers: [9, 7, 15]
// Sorted Even Numbers: [2, 4, 12]
// Input 2 :
// 3
// 10
// 20
// 30
// Output 2 :
// Sorted Odd Numbers: []
// Sorted Even Numbers: [10, 20, 30]

// You are using Java
import java.util.*;
abstract class SortNumbers {
   //type your code here
    abstract int[][] sortOddEven(int []arr);
}
class NumberSorter extends SortNumbers {
   //type your code here
    @Override
    public int[][] sortOddEven(int []arr){
        int n = arr.length;
        int oddCount = 0,evenCount = 0;
        for(int num: arr){
            if(num%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        int[] oddNumbers = new int[oddCount];
        int[] evenNumbers = new int[evenCount];
        int oddIndex =0,evenIndex = 0;
        for(int num: arr){
            if(num%2==0){
                evenNumbers[evenIndex++] = num;
            }else{
                oddNumbers[oddIndex++] = num;
            }
        }
        return new int[][]{oddNumbers,evenNumbers};
    }
}
public class OddEvenSeperator{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();
    int[] arr = new int[n];
        
    for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
    }

        NumberSorter sorter = new NumberSorter();
        int[][] result = sorter.sortOddEven(arr);
        
        int[] oddNumbers = result[0];
        int[] evenNumbers = result[1];

        System.out.print("Sorted Odd Numbers: [");
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i]);
            if (i < oddNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Sorted Even Numbers: [");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i]);
            if (i < evenNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}