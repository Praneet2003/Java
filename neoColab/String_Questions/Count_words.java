// Problem Statement
// Sophia is building a text-processing application that analyzes user-inputted sentences. She needs to determine the number of words in each sentence entered by the user. 
// Write a program for Sophia that takes a full sentence as input, splits it into individual words, and outputs the total word count. 
// Input format :
// The input consists of a string, representing a sentence.
// Output format :
// The output prints the number of words in the input sentence.
// Refer to the sample output for formatting specifications.
// Code constraints :
// The input sentence may include letters (both lowercase and uppercase), spaces, and common punctuation marks.
// Sample test cases :
// Input 1 :
// The quick brown fox
// Output 1 :
// 4
// Input 2 :
// Count the number of words in the program!
// Output 2 :
// 8
import java.util.*;
class Count_words{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count =1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '&& i != (s.length()-1)){
                count++;
            }
        }
        System.out.println(count);
    }
}