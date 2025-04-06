import java.util.*;
class unique_elements{
    public static String getuninique(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        String s3 = s1+s2;
        for(int i=0;i<s3.length();i++){
            char c = s3.charAt(i);
            if(sb.indexOf(String.valueOf(c))==-1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
public class Select_unique_elements_from_Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the string2: ");
        String s2 = sc.nextLine();
        String result = unique_elements.getuninique(s1, s2);
        System.out.println(result);
    }
}