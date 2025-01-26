
import java.util.Scanner;

class convert_tolowerCase{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Coverted to lowercase: "+name.toLowerCase());
        System.out.println("Replace spaces with underscore: "+ name.replace(' ','_'));
    }
}
// Hello worlD I am Praneet
// Coverted to lowercase: hello world i am praneet
// Replace spaces with underscore: Hello_worlD_I_am_Praneet