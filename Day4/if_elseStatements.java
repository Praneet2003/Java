import java.util.*;
class if_elseStatements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter your budget for a car in lakh: ");
        if(!sc.hasNextFloat()){
            System.out.println("Please eneter a valid input in float data: ");
        }
        float a = sc.nextFloat();
        if(a>=2.56 && a<=3.45){
            System.out.println("You have an option to buy an Alto car.");
        }else if(a>=3.5 && a<=5.78){
            System.out.println("You have Several options to buy a car: Celereo, Spreso, K10");
        }else if(a>=6 && a<=8.55){
            System.out.println("You have options to buy a car: Swift, baleno,tiago,nexon,brezza");
        }else if(a>=8.76 && a<=12.67){
            System.out.println("You have options to buy a car: nexon,brezza,creta,bolero");
        }else if(a>=12.78){
            System.out.println("You can buy any car as you wish.");
        }else{
            System.out.println("Sorry we are not able to provide cars below this range.");
        }
    }
}