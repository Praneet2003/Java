import java.util.*;
class Percentage_Calculator{
    public static void main(String arr[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the top 5 subject Marks of the Sudent");
        float a = obj.nextFloat();
        float b = obj.nextFloat();
        float c = obj.nextFloat();
        float d = obj.nextFloat();
        float e = obj.nextFloat();
        float sum = a+b+c+d+e;
        sum/=5;
        System.out.print("The total percentage of Student is: "+String.format("%.2f",sum));
    }
}