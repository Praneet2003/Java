// Harry is developing a graphics application that allows users to calculate the area of different shapes. Users can input the shape type (either SQUARE or TRIANGLE) and relevant dimensions. 
// The task is to write a program to accommodate the SQUARE and TRIANGLE shapes in the enum Shape to find the area of squares and triangles.
// Input format :
// The first line of input consists of a string, representing the shape (SQUARE or TRIANGLE).
// If the shape is 'SQUARE', the second line consists of double value a, representing the side of the square.
// If the shape is 'TRIANGLE', the second line consists of two double values b and h, representing the base and height of the triangle, respectively.
// Output format :
// If the shape type is valid, print the area of the shape. If the shape type is invalid, print "Invalid Input".
// Refer to the sample output for formatting specifications.
// Code constraints :
// The input is case-insensitive.
// 0.1 ≤ a , b , h ≤ 100.0
// Sample test cases :
// Input 1 :
// SqUARe
// 5.5
// Output 1 :
// 30.25
// Input 2 :
// CIRCLE
// Output 2 :
// Invalid Input
// Input 3 :
// TRIANGLE
// 4.0
// 6.0
// Output 3 :
// 12.0
import java.util.*;
enum Shape{
    SQUARE,
    TRIANGLE
}
public class Shape_Area_Using_Enum{
    public static void main(String arr[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        if(s.equalsIgnoreCase("SQUARE")|| s.equalsIgnoreCase("TRIANGLE")){
            Shape shape = Shape.valueOf(s);
        switch(shape){
            case SQUARE:
                double a =  sc.nextDouble();
                System.out.println(String.format("%.2f",(a*a)));
                break;
            case TRIANGLE:
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                System.out.println(String.format("%.1f",(0.5*b*c)));
                break;
            default:
                System.out.println("Invalid Input");
            }
        }else{
            System.out.println("Invalid Input");
        }
        // if(s.equalsIgnoreCase("SQUARE")){
            
        // }else if(s.equalsIgnoreCase("TRIANGLE")){
        //     double a = sc.nextDouble();
        //     double b = sc.nextDouble();
        //     System.out.println(String.format("%.1f",(0.5*a*b)));
        // }else{
        //     System.out.println("Invalid Input");
        // }
    }
}