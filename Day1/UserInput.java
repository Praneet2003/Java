import java.util.Scanner;
class UserInput{
    public static void main(String arr[]){
        System.out.println("Creating the object for Scanner class");
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the integer data: ");
        int a = obj.nextInt();
        System.out.print("Enter the Float data: ");
        float b = obj.nextFloat();
        float sum = a+b;
        System.out.print("The sum of int and float data are: "+String.format("%.3f",sum));
    }
}