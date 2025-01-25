import java.util.*;
class Expesion2_using_Pow{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value of v: ");
        float v = obj.nextFloat();
        System.out.print("Enter the value of u: ");
        float u = obj.nextFloat();
        System.out.print("Enter the value of a: ");
        float a = obj.nextFloat();
        System.out.print("Enter the value of s: ");
        float s = obj.nextFloat();
        double D = (Math.pow(v,2.0) - Math.pow(u,2.0))/(2*a*s);
        System.out.println("The value of D: "+ String.format("%.2f",D));
    }
}