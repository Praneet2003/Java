import java.util.*;
class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}
class Good_or_bad_Password{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        int flag = 0;
        try {
            if(email.indexOf("@")==-1 || email.length()<10){
                throw new MyException("Invalid Email");
            }
            System.out.println("Valid email");
            flag=1;
        } catch (MyException e) {
            System.err.println(e);
        }
        if(flag==1){
        System.out.println("Enter your password");
        String str = sc.nextLine();
        try {
            if(str.length()<10){
                throw new MyException("Bad Password");
            }
            System.out.println("Good Password");
        } catch (MyException e) {
            System.err.println(e);
        }
        }
    }
}