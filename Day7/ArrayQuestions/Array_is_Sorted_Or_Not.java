import java.util.*;
class Array_is_Sorted_Or_Not{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("enter the elements of an array: ");
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int flag1=0;
        int flag2=0;   
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                flag1 = 1;
            }else{
                if(arr[i-1]>arr[i]){
                    flag2 =1;
                }
            }
        }
        if(flag1==1){
            System.out.println("Array is sorted in ascending order.");
        }else if(flag2==1){
            System.out.println("Array is sorted in descending order.");
        }else{
            System.out.println("Array is not sorted in any order.");
        }
    }
}