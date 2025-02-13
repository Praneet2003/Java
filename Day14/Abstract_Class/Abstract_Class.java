abstract class Base{ 
    public Base(){
        System.out.println("I am the constructor of base class");
    }
    public void sayHello(){
        System.out.println("Hello world");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child extends Base{
    @Override
    public void greet2(){
        System.out.println("Bye Bye!!!! from child1.");
    }
    @Override
    public void greet(){
        System.out.println("Good morning from child1");
    }
    public child(){
        System.out.println("I am the cnstructor of child1.");
    }
}
// NOTE: if a class is inherited from an abstract class then :
// 1. either all the abstract functions should be overrided.
// 2. or the inherited class should be declared as an abstract class.
class child2 extends Base{
    @Override
    public void greet2(){
        System.out.println("Bye Bye!!!! from child2.");
    }
    @Override
    public void greet(){
        System.out.println("Good Afternoon from child2");
    }
    public child2(){
        System.out.println("I am the cnstructor of child2.");
    }
}
abstract class child3 extends Base{
    public child3(){
        System.out.println("Hello i am an abstract class as child3");
    }
}
public class Abstract_Class{
    public static void main(String[] args) {
        child c = new child();
        c.greet();
        c.greet2();
        //NOTE: you cannot create any object for abstract class.
        child2 c1=new  child2();
        c1.greet(); 
        c1.greet2();
    }
}