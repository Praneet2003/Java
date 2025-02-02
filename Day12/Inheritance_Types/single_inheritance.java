import java.util.*;
class base{
    public base(){
        System.out.println("This is the base class Constructor.");
    }
    public void feature(){
        System.out.println("This class have the feature of car frame structure.");
    }
}
class derived extends base{
    public derived(){
        System.out.println("This is the derived class Constructor.");
    }
    public void feature1(){
        System.out.println("This class have the feature of car body making and painting.");
    }
}
class single_inheritance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        derived d = new derived();
        d.feature();
        d.feature1();
    }
}