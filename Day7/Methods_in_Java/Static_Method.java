import java.util.*;
class Static_Method{
    static int Average(int a, int b){
        //we are using static method becuse you cannot call a non-static method from a static method.
        int sum = a+b;
        sum/=2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for Average calculation.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res;
        res = Average(a,b);
        System.out.println("Average is: "+res);
    }
}