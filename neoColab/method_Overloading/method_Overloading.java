/*
Problem Statement
Anjana, a software developer, is tasked with creating a class named Calculator that can handle different arguments to calculate their sum. The class should have two overloaded methods: one for summing integers and another for summing doubles.
The Calculator class should be able to:
1. Accept an array of integers and return their sum.
2. Accept an array of doubles and return their sum.
Write a program to help Anjana finish her task.

Input format :
The first line of input consists of a space-separated list of integers.
The second line consists of a space-separated list of double values.

Output format :
The first line of output prints the calculated sum of the integer values.
The second line prints the calculated sum of the double values, rounded off to one decimal place.

Refer to the sample output for formatting specifications.
Code constraints :
In this scenario, the test cases fall under the following constraints:
0 ≤ Integer Array Elements ≤ 100000
0.0 ≤ Double Array Elements ≤ 100.00
The number of elements in the double array need not be the same as that of an integer array.
Sample test cases :
Input 1 :
1 2 3
1.3 2.5
Output 1 :
Sum of integers: 6
Sum of doubles: 3.8
Input 2 :
15 25 35 45 55 65
1.1 2.2 3.3 4.4 5.5 6.5
Output 2 :
Sum of integers: 240
Sum of doubles: 23.0*/

import java.util.*;
class Calculator {
    //type your code here
    int sum(int []arr){
        int s=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        return s;
    }
    double sum(double []arr){
        double s=0.0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        return s;
    }
}
class method_Overloading{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String intInput = scanner.nextLine();
        String[] intStrings = intInput.split(" ");
        int[] intArray = new int[intStrings.length];
        for (int i = 0; i < intStrings.length; i++) {
            intArray[i] = Integer.parseInt(intStrings[i]);
        }
        
        int intSum = calculator.sum(intArray);

        String doubleInput = scanner.nextLine();
        String[] doubleStrings = doubleInput.split(" ");
        double[] doubleArray = new double[doubleStrings.length];
        for (int i = 0; i < doubleStrings.length; i++) {
            doubleArray[i] = Double.parseDouble(doubleStrings[i]);
        }
        double doubleSum = calculator.sum(doubleArray);
        
        System.out.println("Sum of integers: " + intSum);
        System.out.println("Sum of doubles: " + doubleSum);
    }
}