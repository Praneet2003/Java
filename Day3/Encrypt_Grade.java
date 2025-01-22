
import java.util.Scanner;

class Encrypt_Grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        grade += (char)8;
        System.out.println("Encrypted grade: "+ grade);
    }
}