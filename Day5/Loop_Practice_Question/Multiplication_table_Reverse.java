import java.util.*;
class Multiplication_table_Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=10;i>0;i--){
            System.out.printf("%d * %d = %d\n",n,i,(n*i));
        }
    }
}
// 5
// 5 * 10 = 50
// 5 * 9 = 45
// 5 * 8 = 40
// 5 * 7 = 35
// 5 * 6 = 30
// 5 * 5 = 25
// 5 * 4 = 20
// 5 * 3 = 15
// 5 * 2 = 10
// 5 * 1 = 5