
// Saran is exploring operator precedence and wants to create a program that calculates a result using user input for four integer values: x, y, z, and w. 
// Follow the sequence of comparisons below:
// If x is less than y, then the value is x.
// Otherwise, compare y and z: if y is less than z, then the value is y.
// Otherwise, compare z and w: if z is less than w, then the value is z.
// Otherwise, the value is w.


// Assist Saran in completing the program by creating the expression while ensuring proper adherence to the rules of operator precedence.
// Input format :
// The input consists of four space-separated integers x, y, z and w.
// Output format :
// The output prints "Result: " followed by an integer, representing the result of the expression.
// Refer to the sample output for formatting specifications.
// Code constraints :
// 1 ≤ x, y, z, w ≤ 150

// Sample test cases :
// Input 1 :
// 5 2 3 8
// Output 1 :
// Result: 2
// Input 2 :
// 148 132 126 139
// Output 2 :
// Result: 126
// Input 3 :
// 12 25 36 67
// Output 3 :
// Result: 12
import java.util.*;
class Ternary_Operator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x,y,z,w;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        w = sc.nextInt();
        int res = (x<y)?x:((y<z)?y:(z<w)? z:w);
        System.out.println("Result: "+res);
    }
}