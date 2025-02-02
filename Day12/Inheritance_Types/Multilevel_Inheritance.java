// mutilevel inheritance is a chaning inheritance, in which a derived class is derived from a class
// which is also derived from some another class.
class car{
    public void details(){
        System.out.println("the car model is Tata Indica v2");
    }
}
class engine extends car{
    public void engineDetails(){
        System.out.println("110NM torque and 130BHP.");
    }
}
class speed extends engine{
    public void topSpeed(){
        System.out.println("The top speed of the car is: 160 Km/Hr.");
    }
}
public class Multilevel_Inheritance{
    public static void main(String[] args) {
        speed sp = new speed();
        sp.topSpeed();
        sp.engineDetails();
        sp.details();
    }
}