import java.util.*;
class Array_as_Argument{
    static void correction(int[] arr){
        arr[0]=98;
    }
    static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Array elements before correction.");
        print(arr);
        correction(arr);
        System.out.println("\nArray elements After correction.");
        print(arr);
    }
}