class Base{
    public Base(){
        System.out.println("Hi this is the constructor of Base class.");
    }
}
class child1 extends Base{
    public child1(){
        System.out.println("Hi this is the constructor of child1 class.");
    }
}
class child2 extends Base{
    public child2(){
        System.out.println("Hi this is the constructor of child2 class.");
    }
}
class Hieriarical_Inheritance{
    public static void main(String[] args) {
        child1 obj = new child1();
        child2 obj1 = new child2();
    }
}