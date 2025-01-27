import java.util.*;
class Method_call_using_Objects{
    boolean IsEven(int a,int b){
        int x = (a+b)/2;
        if(x%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to check their avg is even or not.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Creating the object of class Method_call_using_Objects");
        Method_call_using_Objects obj = new Method_call_using_Objects();
        System.out.println("Acessing the method IsEven of the class using object.");
        if(obj.IsEven(a, b)){
            System.out.println("The avg is even");
        }else{
            System.out.println("The avg is not even");
        }
    }
}