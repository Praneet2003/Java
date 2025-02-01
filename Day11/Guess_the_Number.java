/* Create a class , which allows a user to play "Guess the number game once."
Game should have following methods:
1. Constructor to genetrate random number.
2. take Useinput() to detect whether the number is correct or not.
4. getters and setters.
5. use properties such as noOfguesses(int) etc get this task done.*/
import java.util.*;
class Guess_NUmber{
    private int num;
    private int x;
    private int count = 0;
    public Guess_NUmber() {
        Random random = new Random();
        num = random.nextInt(100);
    }
    public boolean isCorrect(){
        if(x==num){
            return true;
        }else{
            return false;
        }
    }
    public void guess(){
        if(isCorrect()){
            System.out.println("CoNgRaTuLaTiOnS!!! YoU WoN.");
        }else{if(num>x){
            System.out.println("You entered a smaller number");
            }else{
                System.out.println("You entered a greate rnumber.");
            }
        }
    }
    public void guessDetails(){
        System.out.println("Computer/prize number was: "+num);
        System.out.println("user guess was: "+x);
    }
    public void getuserInput(int x){
        this.x = x;
        count++;
    }
    public int noofGuesses(){
        // count++;
        return count;
    }
}
public class Guess_the_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number b/w 0 to 100 inclusively.");
        int n = sc.nextInt();
        Guess_NUmber gn = new Guess_NUmber();
        gn.getuserInput(n);
        while (true) { 
            gn.guess();
            if(!gn.isCorrect()){
                n = sc.nextInt();
                gn.getuserInput(n);
            }else{
                break;
            }
        }
        gn.guessDetails();
        System.out.println("Total number of guesses are: "+gn.noofGuesses());
    }
}