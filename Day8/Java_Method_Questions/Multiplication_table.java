import java.util.Scanner;
class Multiplication_table{
    static void multiply(int a){
        for(int i=1;i<=10;i++){
            System.out.format("\n%d X %d => %d",a,i,a*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get it's table: ");
        int a = sc.nextInt();
        multiply(a);
    }
}