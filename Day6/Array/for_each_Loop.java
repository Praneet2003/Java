// for each loop in java is similar to the for loop in python.
// it is more easier to use when we have to display all elements of array
// we can use it without any iteration.
import java.util.*;
class for_each_Loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = new String[10];
        for(int i=0;i<10;i++){
            arr[i] = sc.nextLine();
        }
        System.out.println("The Employees of the companies are: ");
        for(String emp : arr){
            System.out.println(emp+" ");
        }
    }
}