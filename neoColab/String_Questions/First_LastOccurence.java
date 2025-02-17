
import java.util.*;
class First_LastOccurence{
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        if(s.indexOf(c)!= -1 && s.lastIndexOf(c)!= -1){
        System.out.printf("First occurrence of %c: %d\n",c,s.indexOf(c));
        System.out.printf("Last occurrence of %c: %d\n",c,s.lastIndexOf(c));
        }else{
            System.out.printf("%c not found in the string",c);
        }
    }
}