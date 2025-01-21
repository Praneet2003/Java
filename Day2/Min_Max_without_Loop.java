import java.util.Scanner;
class Min_Max_without_Loop{
// You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        int a1 = sc.nextInt();
        maxi = a1;
        mini = a1;
        int a2 = sc.nextInt();
        if(a2>maxi){
            maxi = a2;
        }else {
            mini = a2;
        }
        int a3 = sc.nextInt();
        if(a3>maxi){
            maxi = a3;
        }else if(a3<mini){
            mini = a3;
        }
        int a4 = sc.nextInt();
        if(a4>maxi){
            maxi = a4;
        }else if(a4<mini){
            mini = a4;
        }
        int a5 = sc.nextInt();
        if(a5>maxi){
            maxi = a5;
        }else if(a5<mini){
            mini = a5;
        }
        System.out.println("Largest: "+maxi);
        System.out.println("Smallest: "+mini);
    }
}
// -5 -12 9 3 -8
// Largest: 9
// Smallest: -12