import java.util.*;
class Expresion{
    public static void main(String arr[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // float b = sc.nextFloat();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // float d = sc.nextFloat();
        int d = sc.nextInt();
        float total = (a/b)*(c/d);
        //if all the varible where integer then the value after decimal will get lost so atleast two variable b, d should be float.
        System.out.println("The Solution of the Expression is: "+ String.format("%.2f",total));
        float sum = 7/4.0f * 9/2.0f;
        System.out.println(String.format("%.2f",sum));
    }
}
// FOr the same values we have two differnet answers
// 7 4 9 2
// The Solution of the Expression is: 4.00
// 7.88