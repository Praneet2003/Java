// print a pattern left side triangular inverted(ulta).
// * * * *
// * * *
// * *
// *
import java.util.*;
class Pattern_Print{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

