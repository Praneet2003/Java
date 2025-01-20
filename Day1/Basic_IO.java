// You are using Java
import java.util.Scanner;
public class Basic_IO{
    public static void main(String args[]){
        Scanner c = new Scanner(System.in);
        String name = c.nextLine();
        int a = c.nextInt();
        int b = c.nextInt();
        float c1 = c.nextFloat();
        boolean d = c.nextBoolean();
        System.out.println("Model Name: "+name);
        System.out.println("Training Epochs: "+a);
        System.out.println("Batch Size: "+b);
        System.out.println("Learning Rate: "+String.format("%.2f",c1));//getting the 2 point decimal only
        System.out.println("Training Successful: "+d);
    }
}