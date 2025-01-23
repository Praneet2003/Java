import java.util.*;
class Leap_Year_Or_Not{
    public static void main(String[] args) {
        System.out.println("Enter the year to check Leap year or Not: ");
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        if((y%4==0 && y%100!=0) || (y%400==0)){ 
            System.out.printf("The year %d is a leap year",y);
        }
    }
}
// }Enter the year to check Leap year or Not: 
// 2000
// The year 2000 is a leap year