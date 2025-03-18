import java.util.*;
class SecondsToTime {
   //type your code here
    int h,m,s;
    SecondsToTime(int seconds){
    this.h = seconds/3600;
    seconds%=3600;
    this.m = seconds/60;
    seconds%=60;
    this.s = seconds;
    }
    void displayTime(){
    System.out.println(String.format("%02d:%02d:%02d",h,m,s));
    }
}
public class Time_From_Seconds{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeconds = scanner.nextInt();
        scanner.close();

        SecondsToTime timeConverter = new SecondsToTime(totalSeconds);
        timeConverter.displayTime();
    }
}