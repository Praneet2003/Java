abstract class A{
    abstract void print();
}
abstract class B extends A{
    // @Override
    // void print(){
    //     System.out.println("Hello from class B and i am abstract method of class A");
    // }
    abstract void print2();
}
class emplement extends B{
    @Override
    void print(){
        System.out.println("Hello from class emplement and i am abstract method of class A");
    }
    @Override
    void print2(){
        System.out.println("Hello from class emplement and i am abstract method of class B");
    }
}
class Multilevel_abstract_class{
    public static void main(String arg[]){
        emplement obj = new emplement();
        obj.print();
        obj.print2();
    }
}