import java.util.*;
class  String_Methods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Strings are immutable, all methods of string returns a new String.");
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // 1. length():
        System.out.println("String length: "+str.length());
        // 2. toLowerCase():- it returns a new string with all charcters in lowercase.
        //  shortcut to apply this method write only <String name>.tlc then enter.
        System.out.println("Lowercase string: "+str.toLowerCase());
        // 3. toUpperCase():- it returns a new string with all charcters in Uppercase.
        //  shortcut to apply this method write only <String name>.tuc then enter.
        System.out.println("Uppercase string: "+str.toUpperCase());
        //4. trim(): returns a new string by removing all leading and traling spaces.
        System.out.print("Eneter a new string to trim: ");
        String str1 = sc.nextLine();
        System.out.println("String length before triming: "+str1.length());
        String str2 = str1.trim();// we used another string beause strings are immutable and original string remains as it is.
        System.out.println("String afte triming: "+ str2.trim());
        System.out.println("String length after triming: "+str2.length());
        // 5. Substring(int start, int end)
        // this return a new string from start to end index, includes strat index and excludes end index.
        System.out.println("Printing substring without end index: "+ str.substring(3));
        System.out.println("printing substring: "+ str.substring(0,5));
        // if you try to print a substring with start index 0 then it is redundant because it is similar to original string only.
        System.out.println("Printing substring without ending index and 0 as starting index: "+str.substring(0));//redundant.
        // 6. replace(char1, char2): replace all occurences of char1 with char2.
        //  replace(str1, str2): replaces all occurence of str1 with str2.
        String s = "I as Happy today";
        System.out.println("String after replacing: "+ s.replace("Happy", "Sad"));// replaces happ with sad.
        System.out.println("String after replacing: "+ s.replace('a', 'i'));// replaces all a with i.
        // 7. startWith(string): returns true if a string starts with a value given by user otherwise returns false.
        System.err.println("startsWith(\"I am\"): "+s.startsWith("I am"));
        // 8. endsWith(string): returns true if a string ends with a value given by user otherwise returns false.
        System.out.println("endsWith(\"Y\")"+s.endsWith("y"));
        // 9. charAt(int): return the charcter present at the specific index give by user.
        System.out.println("character at index 4 is: "+ s.charAt(2));
    }
}