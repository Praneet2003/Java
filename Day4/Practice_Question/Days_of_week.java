import java.util.*;
class Days_of_week{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number b/w 1-7.");
        int a = sc.nextInt();
        switch(a){
            case 1:
                System.err.println("Sunday");
                break;
            case 2:
                System.err.println("Monday");
                break;
            case 3:
                System.err.println("Tueday");
                break;
            case 4:
                System.err.println("Wednesday");
                break;
            case 5:
                System.err.println("Thusday");
                break;
            case 6:
                System.err.println("Friday");
                break;
            case 7:
                System.err.println("Saturday");
                break;
            default:
                System.err.println("Invalid input!!!!");
        }
    }
}