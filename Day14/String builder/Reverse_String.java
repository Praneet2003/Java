import java.util.*;
class Reverse_String{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //NOte : we can use stringbuilder as well as stringbuffer class.
        StringBuffer sb = new StringBuffer(str);
        int s = 0,e=sb.length()-1;
        while(s<=e){
            char temp = sb.charAt(s);
            sb.setCharAt(s,sb.charAt(e));
            sb.setCharAt(e, temp);
            s++;
            e--;
        }
        System.out.println(sb);
    }
}