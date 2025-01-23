import java.util.*;
class String_initiaization{
    public static void main(String[] args) {
    //1. using String literals.
        String name = "Praneet Raj";
        System.out.println("String from literals: "+ name);


    //2. using new kwyword.
        String Address = new String("Bihar");
        System.out.println("String from new Keyword: "+ Address);


    //3. using character array and new keyword.
        char[] characterArray = {'j','a','v','a'};
        String str = new String(characterArray);
        System.out.println("String from Character array: "+ str);


    //4. using StringBuilder or StringBuffer class.
                            // *NOTE* :- StringBuilder are mutable alernatives, you can use it hwen frequent modification in string is required.
        StringBuilder sb = new StringBuilder();//you cannot take input in StringBuilder class.
        // you have to take input in Scanner class Object then append it in StringBuilder object
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the String in StringBuilder: ");
        String input = obj.nextLine();
        sb.append("Hello Mr.");//Appending some text in sb object of StringBuilder.
        sb.append(input);//Appending input in sb object of StringBuilder.
        String Builder = sb.toString();
        //.toString is a method used to get String representation from object.
        System.out.println("String from StringBuilder: "+Builder);


    //5. Using String.valueof() method: 
        //used for converting other datatype into string.
        int num = 45;
        String fromNum = String.valueOf(num);
        System.out.println("String using String.valueof(): "+ fromNum);
    }
}