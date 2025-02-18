
import java.util.Arrays;
import java.util.Scanner;
class Solution {
    // problem no 128
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int largest= 1,current = 1;
        if(nums.length ==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                current++;
            }else{
                largest = Math.max(largest,current);
                current = 1;
            }
        }
        return Math.max(largest,current);
    }
}
public class Count_longest_Series{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Solution s = new Solution();
        int a = s.longestConsecutive(arr);
        System.out.print(a);
    }
}