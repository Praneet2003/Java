import java.util.*;
// import javax.xml.catalog.CatalogFeatures;
class Features{
    void ring(){
        System.out.print("The phone is ringing: ");
    }
    void vibrate(){
        System.out.println("The phone is vibrating.");
    }
    void callfriend(){
        System.err.println("Calling.");
        ring();
        // vibrate();
    }
    void incommingCall(){
        System.out.println("Someone is calling you.");
        ring();
        vibrate();
    }
    void incommingMsg(){
        System.out.println("Received one message.");
        vibrate();
    }
}
public class CellPhone{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Features f = new Features();
        System.out.println("Please select a number b/w 1 to 3: ");
        int a = sc.nextByte();
        switch (a) {
            case 1:
                f.callfriend();
                break;
            case 2:
                f.incommingCall();
                break;
            case 3:
                f.incommingMsg();
                break;
            default:
                System.out.println("Please eneter a valid choice.");
        }
    }
}
// Please select a number b/w 1 to 3: 
// 3
// Received one message.
// The phone is vibrating.