// the major difference b/w while and do while loop are.
// while loop first checks the condition then after it exectues the code.
// do while loop first executes the code after that it check the condition.
// do while runs atleast once irrespective of the condition.
import java.util.*;
class while_Vs_do_while{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a = 10;
        while(a<5){
            System.out.println(a);
            a++;
        }
        System.out.println("Exiting the while loop.");
        do { 
            System.out.println(a);
        } while(a<5);
        System.out.println("Exiting the do-while loop.");
    }
}
// Exiting the while loop.
// 10
// Exiting the do-while loop.