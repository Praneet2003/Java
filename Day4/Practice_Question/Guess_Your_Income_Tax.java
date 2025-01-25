import java.util.*;
// you are going to develop a program to calculate the income tax to be duducted.
// if sal is b/w 2.5 l 0 5 tax.
// if sal is b/w 2.5 l to 5.0 l cut 5%.
// if sal is b/w 5.0 to 10.0 l cut 20%
// if sal is above 10 l cut 30%
class Guess_Your_Income_Tax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary in lakh: ");
        float sal = sc.nextFloat();
        if(sal<=2.5){
            System.out.println("No income tax applicable.");
            sal = sal - sal*0/100;
            System.out.println("Net salary: "+sal);
        }else if(sal>2.5 && sal<=5.0){
            System.out.println("5% income tax applicable.");
            sal = sal - sal*5/100;
            System.out.println("Net salary: "+sal);
        }else if(sal>5.0 && sal<=10.0){
            System.out.println("20% income tax applicable.");
            sal = sal - sal*20/100;
            System.out.println("Net salary: "+sal);
        }else{
            System.out.println("30% income tax applicable.");
            sal = sal - sal*30/100;
            System.out.println("Net salary: "+sal);
        }
    }
}