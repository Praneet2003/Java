// Nick is tasked with developing a Text Replacement Engine that replaces all occurrences of a specified substring in a given text. The engine should take the original text, the substring to be replaced, and the replacement string as input and output the modified text after performing the replacement.



// Help Nick complete the task of implementing text replacement for efficient string manipulation using the StringBuilder class.

// Input format :
// The first line of input contains a string representing the original string.

// The second line of input contains a string representing the substring to replace.

// The third line of input contains a string representing the replacement string.

// Output format :
// The first line of output prints a string representing the original string.

// The second line of output prints a string representing the modified string after replacement.



// Refer to the sample output for formatting specifications.

// Code constraints :
// 3 ≤ length of string ≤ 500

// Sample test cases :
// Input 1 :
// Hello, world! Hello, Java!
// Hello
// Hi
// Output 1 :
// Hello, world! Hello, Java!
// Hi, world! Hi, Java!
// Input 2 :
// Programming is fun!
// fun
// exciting
// Output 2 :
// Programming is fun!
// Programming is exciting!
// You are using Java
import java.util.*;
class StringManipulation {
    //type your code here
    public static String replaceWithStringBuilder(String original, String toReplace, String replacement){
        StringBuilder sb = new StringBuilder(original);
        int n = sb.indexOf(toReplace);
        while(n!=-1){
            sb.replace(n,n+toReplace.length(),replacement);
            n = sb.indexOf(toReplace,n+toReplace.length());
            
        }
        return sb.toString();
    }
}
class Replace_string{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();

        String toReplace = scanner.nextLine();
        String replacement = scanner.nextLine();
        String replacedString = StringManipulation.replaceWithStringBuilder(originalString, toReplace, replacement);

        System.out.println(originalString);
        System.out.println(replacedString);
    }
}