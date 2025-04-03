import java.util.*;
class RemoveduplicateUtility{
    public static String removeduplicate(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(sb.indexOf(String.valueOf(c))==-1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
public class Remove_duplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String result = RemoveduplicateUtility.removeduplicate(str);
        System.out.println("The unique string is: "+result);
    }
}