import java.util.*;
class BMI_Calculator{
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double BMI = a/(b*b);
        System.out.println("BMI: "+ String.format("%.2f",BMI));
        if(18.5<=BMI && BMI<=24.9)
        System.out.println("Healthy Range");
        else
        System.out.println("Not in Healthy Range");
    }
}
// 124.7
// 1.87 
// BMI: 35.66
// Not in Healthy Range