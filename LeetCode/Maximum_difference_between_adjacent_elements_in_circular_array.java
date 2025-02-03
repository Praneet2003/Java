import java.util.*;
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;  // no adjacent elemnt to compare with.
        }
        int maxDiff = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums[i] - nums[(i + 1) % n]);// circular array.
            maxDiff = Math.max(maxDiff, diff);
        }
        return maxDiff;
    }
}
public class Maximum_difference_between_adjacent_elements_in_circular_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        System.out.println("Eneter the number of elements to enter.");
        int n = sc.nextInt();
        sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = s.maxAdjacentDistance(arr);
        System.out.println("the max difference is: "+result);
    }
}