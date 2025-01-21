import java.util.*;
class Rounding_Decimal{
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        double x = Math.round(a);
        if(n==1)
        System.out.println("Rounded to the nearest whole number: "+ String.format("%.1f",x));
        else if(n==2)
        System.out.println("Rounded to one decimal place: "+String.format("%.1f",a));
        else if(n==3)
        System.out.println("Rounded to two decimal places: "+String.format("%.2f",a));
        else
        System.out.println("Invalid choice.");
    }// import java.util.*;
}