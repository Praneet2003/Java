// SUm of n even numbers.
import java.util.Scanner;
class Sum_of_n_Even{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int sum = 0;
        while(i<n){
            sum+=(2*i);
            i++;
        }
        System.out.printf("sum of %d even numbers are %d",n,sum);
    }
}
// 5
// sum of 5 even numbers are 20