// break statement is used to exit the loop irrespective of wheteher the condition is true or false.
// whenever a loop encounters break inside the loop the control is sent outside the loop. 
import java.util.*;
class breakStatements{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 10;
        for(int i=0;i<n;i++){
            System.out.println(i+" java is great.");
            if(i==2){
                System.out.println(i+" ending the loop.");
                break;
            }
        }
        System.out.println("break inside the while loop.");
        int b = sc.nextInt();
        while(b<10){
            System.out.print(b +" ");
            if(b==5){
                System.out.println("Time to end the loop, bye!!!!!");
                break;
            }
            b++;
        }
        do { 
            System.out.print(b +" ");
            if(b==5){
                System.out.println("Time to end the loop, bye!!!!!");
                break;
            }
            b++;
        } while (b<10);
        System.out.println("Exiting the do-while loop");
    }
}
// Output: 
// 3
// 0 java is great.
// 1 java is great.
// 2 java is great.
// 2 ending the loop.
// break inside the while loop.
// 4
// 4 5 Time to end the loop, bye!!!!!
// 5 Time to end the loop, bye!!!!!
// Exiting the do-while loop