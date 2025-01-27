import java.util.*;
class Check_Key_Present_or_not{
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
        int flag =0;
        int index=0;
        for (int i = 0; i < 10; i++) {
            if(arr[i]==key){
                index = i;
                flag =1;
                break;
            }else{
                flag = 0;
            }
        }
        if(flag==1){
            System.out.printf("Key Element %d is found at index %d.",key,index);
        }else{
            System.out.printf("Key Element %d is found at index %d.",key,index);
        }
    }
}