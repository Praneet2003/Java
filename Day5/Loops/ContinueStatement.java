import java.util.*;
class ContinueStatement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 10;
        for(int i=0;i<n;i++){
            if(i==2){
                System.out.println("Ending the loop. Skipping the iteration 2.");
                continue;
            }
            System.out.println(i+" java is great.");
        }
        // 3
        // 0 java is great.
        // 1 java is great.
        // Ending the loop. Skipping the iteration 2. 
        // 3 java is great.
        // 4 java is great.
        // 5 java is great.
        // 6 java is great/
        // 7 java is great.
        // 8 java is great.
        // 9 java is great.
        System.out.println("break inside the while loop.");
        int b = sc.nextInt();
        while(b<10){
            System.out.println(b +" ");
            b++;
            if(b==5){
                System.out.println("Time to end the loop, bye!!!!!");
                continue;
            }
        }
        //break inside the while loop.
        // 4
        // 4
        // Time to end the loop, bye!!!!!
        // 5
        // 6
        // 9
        // 7
        // 8
        // 9
        int c = 3;
        System.out.println("Starting the do-while loop.");
        do { 
            c++;
            if(c==5){
                System.out.println("Time to end the do-while loop, bye!!!!!");
                continue;
            }
            System.out.println(c +" ");
        } while (c<10);
        System.out.println("Exiting the do-while loop");
    }
        //     Starting the do-while loop.
        // 4
        // Time to end the do-while loop, bye!!!!!    
        // 6
        // 7
        // 8
        // 9
        // 10
        // Exiting the do-while loop
}