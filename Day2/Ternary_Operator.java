import java.util.*;
class Ternary_Operator{
    public static void main(String[] args) {
        //Type your code here
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        System.out.println((a>0 && b>0 && a%2!=0 && b%2!=0) ? "Both integers are positive and not multiples of 2" : "The condition is not met for both integers");
        obj.close();
    }
}