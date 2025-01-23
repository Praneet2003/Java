import java.util.Scanner;
class Website_type{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.err.print("Enter your website name: ");
        String web = s.nextLine();
        if(web.indexOf(".com")!=-1){// we can also use endsWith() method.
            System.out.printf("The type of your website %s is .com",web);
        }else if(web.indexOf(".org")!=-1){
            System.out.printf("The type of your website %s is .org",web);
        }else if(web.indexOf(".in")!=-1){
            System.out.printf("The type of your website %s is .in",web);
        }else{
            System.out.printf("Invalid link or not Secure to use %s", web);
        }
    }
}