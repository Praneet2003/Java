class Phone{
    public void on(){
        System.out.println("Turning on Phone.");
    }
    public void greet(){
        System.out.println("Good Morning.");
    }
}
class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone.");
    }
    public void music(){
        System.out.println("Smarphone Playing music.....");
    }
}
public class Dynamic_Method_Dispatch{
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.on();
        // real life simple example: 
        // obj aapka dost hai aur usko aapne smartphone uthane ko bola,
        // Ab aapne usko bolo ki on kro to oboiusly wo smartphone hi on krega na.
        // the overided function in derived class will run.
        // Output: Turning on SmartPhone.

        // obj.swagat(); it is not allowed, because obj is reference of phone(base class) and it is not posiible for it,
        // to acesss the method of the Smart phone(Derived class), which is not overloade.
        obj.greet();
    }
}