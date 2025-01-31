import java.util.*;
class Game{
    void run(){
        System.out.println("Tommy is running.");
    }
    void fire(){
        System.out.println("Tommy is firing on enmies.");
    }
    void hit(){
        System.out.println("Tommy is hitting the enemy.");
    }
}
public class TommyClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g = new Game();
        System.err.println("Eneter a no from 1 to 3");
        int a = sc.nextByte();
        switch (a) {
            case 1:
                g.run();
                break;
            case 2:
                g.fire();
                break;
            case 3:
                g.hit();
                break;
            default:
                System.err.println("Invalid choice.");
        }
    }
}