import java.util.Scanner;
class Sum_of_three_number
{
    public static void main(String srr[]){
        Scanner c = new Scanner(System.in);//Objec of scanner class
        //if you don't want to go to next line then simply use System.out.print();
        System.out.print("Enter 1st number: ");//input for number 1.
        int a = c.nextInt();
        System.out.print("Enter 2nd number: ");//input for number 2.
        int b = c.nextInt();
        System.out.print("Enter 3rd number: ");//input for number 3.
        int d = c.nextInt();
        int sum = a+b+d;//sum calculation.
        System.out.print("\n Sum of these Three numbers is: ");
        System.out.println(sum);//printing the sum.
    }
}
