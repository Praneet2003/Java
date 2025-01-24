import java.util.Scanner;
class Factorial_Of_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        System.out.printf("Factorial of number %d is %d",n,fact);
    }
}
// 5
// Factorial of number 5 is 120
