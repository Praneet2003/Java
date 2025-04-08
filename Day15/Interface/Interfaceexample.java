interface Interface {
    default void show() {
        System.out.println("Default Show Method");
    }
    
    static void display() {
        System.out.println("Static Display Method");
    }
}

public class Interfaceexample implements Interface{
    public static void main(String[] args) {
        Interfaceexample obj = new Interfaceexample();
        obj.show();// calling default method of interface
        Interface.display();
    }
}
