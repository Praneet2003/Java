abstract class A{
    abstract void display();
}
class B extends A{
    // here we are using the class B only to implement the method of abstratct class so why don't you use ananomous class.
    public void display(){
        System.out.println("Overrided inside the class B instantiated from A.");
    }
}
class Abstract_and_Anonymous_class{
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.display();
        A obj = new A(){
        //As we know that we cannot instantiate the abstract class 
        // but here we are using ananomus class to override the method of abstract class.
            void display(){
                System.out.println("Hello world!");
            }
        };
        obj.display();
    }
}