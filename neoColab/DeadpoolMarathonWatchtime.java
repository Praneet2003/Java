// Aishu wants to develop a program to calculate the total viewing time for a movie marathon of the Deadpool series based on the number of movies and the frequency of breaks.
// She is provided with the following information:
// Each movie in the series has a fixed duration of 45 minutes.
// After watching a certain number of movies, there is a break of 15 minutes.
// Assist Aishu in creating a program that accepts input for the total number of movies in the series and the number of movies watched before a break. Calculate and output the total viewing time required to watch the entire series, including the breaks. Use the conditional operator for the same.
// Input format :
// The first line of input consists of an integer n, representing the total number of movies in the series.
// The second line consists of an integer k, representing the number of movies watched before a break.
// Output format :
// The output displays an integer representing the total viewing time required to watch the entire series, including the breaks, in minutes.
// Refer to the sample output for formatting specifications.
// Code constraints :
// In this scenario, the test cases fall under the following constraints:
// 1 ≤ n ≤ 20
// 1 ≤ k ≤ 10
// Sample test cases :
// Input 1 :
// 5
// 2
// Output 1 :
// 255 minutes
// Input 2 :
// 4
// 3
// Output 2 :
// 195 minutes
// Input 3 :
// 13
// 5
// Output 3 :
// 615 minutes
import java.util.*;
class DeadpoolMarathonWatchtime{
    public static void main(String[] args) {
       //type your code here
        Scanner obj = new Scanner(System.in);//
        int n = obj.nextInt();//total number of movies.
        int k = obj.nextInt();//movies seen before break
        int breaktime = (n%k==0)? (n/k -1):(n/k);
        System.out.println((n*45)+breaktime*15 +" minutes");
    }
}
// Output: 
// 13 5
// 615 minutes
