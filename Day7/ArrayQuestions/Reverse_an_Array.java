import java.util.*;
class Reverse_an_Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        int [] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]= sc.nextInt();
        }
        int s = 0;
        int e = arr.length -1;
        while(s<=e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        System.out.println("Array after reversing: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}