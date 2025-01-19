import java.util.*;
class Temp_cal{
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        double a = sc.nextFloat();
        double c = (a-32)*5/9;
        if(-100<a && a<150){
            System.out.println("Temperature in Celsius: "+String.format("%.2f",c)+" C");
        }else{
            System.out.println("Temperature outside the human-survivable range");
        }
    }
}
// -65.8
// Temperature in Celsius: -54.33 C
