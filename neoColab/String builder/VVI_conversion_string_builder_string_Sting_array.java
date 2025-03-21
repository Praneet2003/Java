// Problem Statement:

// You are building a chat application where users can send and receive messages. 
// To optimize the storage and transmission of messages, you can implement encoding and decoding methods. When a user sends multiple messages, you can encode them into a single string, which is sent to the recipient. On the recipient's side, the encoded string is decoded back into individual messages for display.
// Input format :
// For encoding, a sequence of strings separated by a delimiter ("#" only ) is provided as input.
// For decoding, a single string containing the encoded data is provided as input.

// Output format :
// For encoding, a single string is output, representing the encoded data.
// For decoding, a sequence of strings separated by a delimiter is output, representing the decoded data.


// Refer to the sample output for format specifications.

// Code constraints :
// 0 ≤ Length of each string ≤ 100

// Sample test cases :
// Input 1 :
// Coding is fun
// Output 1 :
// Encoded: Coding#is#fun
// Decoded: 
// Coding
// is
// fun
// Input 2 :
// Programming@123
// Output 2 :
// Encoded: Programming@123
// Decoded: 
// Programming@123

import java.util.*;
class EncoderDecoder {
     //type your code here
    public static String encode(String s[]){
        StringBuilder sb = new StringBuilder();
        //  String s = s1.toString();
        for(int i=0;i<s.length;i++){
                sb.append(s[i]);
            if(i<s.length-1){
                sb.append('#');
            }
            
        }
        return sb.toString();
    }
    public static String[] decode(String s){
        
        String[] arr=new String[s.length()];
        
        arr=s.split("#");
        //  for(int i=0;i<s.length();i++){
        //      char c = s.charAt(i);
        //      if(c=='#'){
        //          sb.append("\n");
        //      }else{
        //          sb.append(c);
        //      }
        //  }
        //   String str = sb.toString();
        //  String arr[] = new String[str.length()];
        //   for(int i=0;i<s.length();i++){
        //      arr[i] = String.valueOf(str.charAt(i));
            
        //  }
        return arr;
    }
}

class VVI_conversion_string_builder_string_Sting_array{
    public static void main(String[] args) {
        EncoderDecoder encoderDecoder = new EncoderDecoder();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] messages = userInput.split(" ");
        String encoded = encoderDecoder.encode(messages);
        System.out.println("Encoded: " + encoded);
        String[] decoded = encoderDecoder.decode(encoded);
        System.out.println("Decoded: ");
        for (String message : decoded) {
            System.out.println(message);
        }

        scanner.close();
    }
}