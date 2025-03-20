// Elisa, a language processing specialist, is working on a project that requires converting strings to character arrays. To assist her in this task, you are tasked with creating a program that converts a given string to a character array.This program will help Elisa efficiently manipulate and analyze text data by converting it into a more versatile format.

// Input format :
// The first line of input contains a string representing the string to be converted as a character array.

// Output format :
// The output prints a character array obtained from converting the input string is printed as output.



// Refer to the sample output for format specifications

// Code constraints :
// The input string should not be empty.

// The input string may contain alphanumeric characters(uppercase and lowercase), spaces and special characters.

// The input string's length can be up to 105 characters.

// Sample test cases :
// Input 1 :
// Hello
// Output 1 :
// [H, e, l, l, o]
// Input 2 :
// The quick brown fox jumps over the lazy dog.
// Output 2 :
// [T, h, e,  , q, u, i, c, k,  , b, r, o, w, n,  , f, o, x,  , j, u, m, p, s,  , o, v, e, r,  , t, h, e,  , l, a, z, y,  , d, o, g, .]
// Input 3 :
// 123ABC!@#
// Output 3 :
// [1, 2, 3, A, B, C, !, @, #]
// You are using Java
import java.util.Scanner;
public class convert_string_to_char_array{
public static void main(String[] args) {
       //type your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        char arr[] = new char[n];
        for(int i=0;i<n;i++){
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<n;i++){
            if(i==0){
                System.out.print("["+arr[i]+", ");
            }else if(i>0 && i<n-1){
                System.out.print(arr[i]+", ");
            }
            if(i==n-1){
                System.out.print(arr[i]+"]");
            }
        }
    }
}
