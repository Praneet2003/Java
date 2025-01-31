// 0 rock
// 1 paper
// 2 scissor.
import java.util.*;
class Rock_Paper_scesior_Game{
    static void printChoice(int x){
        if(x==0){
            System.out.println("Rock.");
        }else if(x==1){
            System.out.println("Paper.");
        }else if(x==2){
            System.out.println("scissor.");
        }else{
            System.out.println("invalid chioce.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice 0 for Rock,1 for paper,2 for scesior: ");
        byte user = sc.nextByte();
        Random random = new Random();
        int computer = random.nextInt(3);
        System.out.println("the coices are: ");
        System.out.print("User's choice: ");
        printChoice(user);
        System.out.print("Computer's choice: ");
        printChoice(computer);
        if(user==computer){
            System.out.println("Draw.");
        }else if(user==0 && computer==2 || user==1 && computer ==0 || user ==2 && computer == 1){
            System.out.println("Player wins!!!");
        }else{
            System.out.println("Computer wins.");
        }
    }
}
// Enter your choice 0 for Rock,1 for paper,2 for scesior: 
// 1
// the coices are:
// User's choice: Paper.
// Computer's choice: Rock.
// Player wins!!!