import java.util.*;
class Adding_Tabs_newline_using_Escape_Sequence_Charcater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // \t is used for adding tabs in your printing statements.
        String s = "Dear\n\t \"Praneet raj\" i would like to thanks for the support you have provided in the event.\n Your Sincerly \n\t \"Shivam.\"";
        System.out.println("String added with tabs and newline and printed in a string format.");
        System.out.println(s);
    }
}
//output: 
// Dear
//          "Praneet raj" i would like to thanks for the support you have provided in the event.
//  Your Sincerly
//          "Shivam."