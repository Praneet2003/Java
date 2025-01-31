import java.util.*;
class sum_Of_first_n_Numbers{
    static int sum(int n){
        int s = n;
        if(n>0){
            s+=sum(n-1);
        }
        return  s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers upto which you want sum: ");
        int n = sc.nextInt();
        System.err.printf("Sum of %d natural numbers is: %d",n,sum(n));
    }
}