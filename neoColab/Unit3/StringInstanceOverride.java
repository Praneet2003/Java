// Problem Statement



// Alice is developing an interactive square calculator program to engage his students. He wants the program to take the user's name and an integer as input, calculate the square of the integer, and display a personalized message using the class CustomClass.



// Alice is interested in ensuring that the program uses the instanceof operator to check the presence of specific instances. 



// Note

// name is an instance of String class.

// customObj is an instanceof CustomClass.

// Any other instance name other than the above-mentioned will create an error.

// Input format :
// The first line of input consists of a string, which represents the name.

// The second line consists of an integer.

// Output format :
// The first line of output displays whether the entered name is an instance of String.

// The second line displays the square of the entered integer.

// The third line displays a custom message from the CustomClass in the format "Hey, [name]! How are you?".

// The fourth line displays whether the instance of customObj is an instance of CustomClass.



// Refer to the sample output for the formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// The string name input should be 100 characters.

// 1 ≤ input integer ≤ 15

// Sample test cases :
// Input 1 :
// Arun
// 3
// Output 1 :
// Name is an instance of String: true
// Square of the entered number: 9
// Hey, Arun! How are you?
// customObj is an instance of CustomClass: true
// Input 2 :
// Sharon
// 12
// Output 2 :
// Name is an instance of String: true
// Square of the entered number: 144
// Hey, Sharon! How are you?
// customObj is an instance of CustomClass: true
import java.util.*;
class CustomClass {
    //type your code here
    void displayMessage(String s){
        System.out.println(s);
    }
    boolean isInstanceOfCustomClass(CustomClass customObj){
        return (customObj instanceof CustomClass);
    }
}
class Utility {
    //type your code here
    boolean isStringInstance(String s){
        // super.n = 
        return (s instanceof String);
    }
    int squareNumber(int n){
        return n*n;
    }
}
public class StringInstanceOverride{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Utility utility = new Utility();
        boolean result1 = utility.isStringInstance(name);
        System.out.println("Name is an instance of String: " + result1);
        int userNumber = scanner.nextInt();
        int squaredNumber = utility.squareNumber(userNumber);
        System.out.println("Square of the entered number: " + squaredNumber);
        CustomClass customObj = new CustomClass();
        customObj.displayMessage("Hey, " + name + "! How are you?");

        boolean result3 = customObj.isInstanceOfCustomClass(customObj);
        System.out.println("customObj is an instance of CustomClass: " + result3);
        scanner.close();
    }
}
