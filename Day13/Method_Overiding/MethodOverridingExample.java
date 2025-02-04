// when a child class redefines a base class function, then it is known as method overriding.
// you cannot override function like: static, final,private. 
class Base {
    void show() {
        // Non-static method, eligible for overriding
        System.out.println("Base class show()");
    }
    void dis(){
        System.out.println("Hello i am in base class");
    }
}

class Derived extends Base {
    @Override//this is an annotion to show that this below method is being overridden.
    void show() {  // Overriding method
        System.out.println("Derived class show()");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        b.show();
        d.show();  // Calls Derived class method (runtime polymorphism)
        b.dis();
    }
}
