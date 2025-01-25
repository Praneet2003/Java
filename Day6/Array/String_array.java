import java.util.*;
class String_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] name = new String[5];
        for(int i=0;i<name.length;i++){
            name[i] = sc.next(); 
        }
        System.out.println("The boss desk number is: "+name[0]);
        System.out.println("Employees at even number desk's are: ");
        for(int i=2;i<name.length;i+=2){
            System.out.print(name[i]+" ");
        }
        System.out.println("\nEmployees at odd number desk's are: ");
        for(int i=1;i<name.length;i+=2){
            System.out.print(name[i]+" ");
        }

    }
}