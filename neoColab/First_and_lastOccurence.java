// ﻿In a content management system, imagine you are tasked with developing a search functionality for users to find the first and last occurrences of a specific character within a word. 



// How would you implement a program to efficiently locate and display these positions within the text, improving the user's reading experience?

// Input format :
// The first line of input consists of the string.

// The second line consists of a character ch to search for in that string.

// Output format :
// The output prints the first and last occurrence (index) of the specified character within the given string. The index starts from 0.

// If the character is not found, print "[ch] not found in the string".



// Refer to the sample output for formatting specifications.

// Code constraints :
// The string is case-sensitive.

// Sample test cases :
// Input 1 :
// Hello, World!
// r
// Output 1 :
// First occurrence of r: 9
// Last occurrence of r: 9
// Input 2 :
// This is a test string.
// i
// Output 2 :
// First occurrence of i: 2
// Last occurrence of i: 18
// Input 3 :
// Lemon
// l
// Output 3 :
// l not found in the string
// You are using Java
import java.util.*;
class First_and_lastOccurence{
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        int n1 = s.indexOf(c);
        int n2 = s.lastIndexOf(c);
        if(n1==-1){
            System.out.printf("%c not found in the string",c);
        }else{
        System.out.printf("First occurrence of %c: %d",c ,n1);
        System.out.printf("\nLast occurrence of %c: %d",c ,n2);
        }
    }
}