// The block having no name.
// It gets excuted whenever the object is created(Just before the constructor).
// it is used to share the commonm code among all the objects & constructors(as object creation depends on the number of parameters in constructor.)
class Anonymousblock{
    {
        System.out.println("This is an Anonymous Block");
    }
    public static void main(String[] args) {
        System.out.println("Main Block");
        Anonymousblock obj = new Anonymousblock();
        System.out.println("Object obj is created");
        Anonymousblock obj1 = new Anonymousblock();
        System.out.println("Another Object obj1 is created");
    }
    static{
        System.out.println("Static block");
    }
    {
        System.out.println("This is an another anonymous Block");
    }
}