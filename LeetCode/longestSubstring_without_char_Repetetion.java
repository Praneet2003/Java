class Solution{
    public int LongestSubstring(String s){
        int ans = 0;
        int count[] = new int[126];
        int left = 0;
        for(int right = 0;right<s.length();right++){
            count[s.charAt(right)]++;
            while(count[s.charAt(right)]>1){
                count[s.charAt(left)]--;
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
class Solution2{
    //problem no: 3
    public int lengthOfLongestSubstring(String s) {
        int count =1,max=1;
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(sb.indexOf(String.valueOf(c))!=-1){
                sb.delete(0,sb.indexOf(String.valueOf(c))+1);
            }
            sb.append(c);
            count = sb.length();
            max = Math.max(count,max);
        }
        return max;
    }
}
class longestSubstring_without_char_Repetetion{
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "abcabccb";
        System.out.println(s.LongestSubstring(str));
        Solution2 s1 = new Solution2();
        System.out.println(s1.lengthOfLongestSubstring(str));
    }
}