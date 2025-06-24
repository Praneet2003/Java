
import java.util.Scanner;

class All_Variables{
    static String bankName;// class variable (Strored in class area(i.e MetaSpace)).
    int balance;// instance variable (Stored in heap).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 10;// local Variable (Stored in Stack).
        bankName = "SBI";
        // balance = 1000; giving error because this variable will only be created after the creation of an object.
        All_Variables obj = new All_Variables();
        obj.balance = 1000;
        obj.bankName = "BOI";//changed the shared variable.
        All_Variables obj1 = new All_Variables();
        System.out.println("After modification by obj calling bankname from obj1 => "+obj1.bankName);
        obj1.bankName = "Indian Bank";
        System.out.println("after modification by obj1 calling bankname from obj => "+obj.bankName);
        System.out.println("Local Variable: "+x);
    }
}