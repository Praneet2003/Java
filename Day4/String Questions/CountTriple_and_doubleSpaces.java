import java.util.*;
class CountTriple_and_doubleSpaces{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(a);
        // we will use indexOf() method to do this.
        System.out.println("Is double spaces present in the string: "+a.indexOf("  "));
        System.out.println("Does this string contains triple spaces: "+a.indexOf("   "));
    }
}
// Hello  World my name is   Praneet   Raj    
// Is double spaces present in the string: 5  
// Does this string contains triple spaces: 23
// Hello world
// Is double spaces present in the string: -1
// Does this string contains triple spaces: -1
