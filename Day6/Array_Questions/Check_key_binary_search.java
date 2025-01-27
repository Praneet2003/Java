import java.util.*;
class Check_key_binary_search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int []arr = new int[s];
        System.out.println("enter the elements of array: ");
        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the key element to search: ");
        int key = sc.nextInt();
        int flag =0,start=0,end = arr.length;
        int index=0;
        Arrays.sort(arr);
        int mid = start+ (end-start)/2;
        while(start<=end){
            if(arr[mid]==key){
                flag = 1;
                break;
            }
            if(arr[mid]>key){
                end = mid-1;
            }else{
                start = mid+1;
            }
            mid = start+(end-start)/2;
        }
        if(flag==1){
            System.out.printf("Key Element %d is found at index %d",key,mid);
        }else{
            System.out.printf("Key Element %d is not found in the array",key);
        }
    }
}
// 5
// enter the elements of array:
// enter the elements of array:
// 68
// 72
// 30
// 45
// 50
// enter the key element to search:
// 50
// Key Element 50 is found at index 2