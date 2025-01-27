import java.util.*;
class Min_Max_Element_In_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the Elements of an array: ");
        int maxi = Integer.MIN_VALUE;
        int mini =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(maxi<arr[i]){
                maxi = arr[i];
            }
            if(mini>arr[i]){
                mini = arr[i];
            }
        }
        System.out.println("The maximum element of array is: "+maxi);
        System.out.println("The minimum element of array is: "+mini);
    }
}