// NOTE: 
// 1. From static context you can only call static members directly but the non static members using object refence only.
// 2. From non-static context you can call static as well as non-static members directly.
class Overloaded_static_non_static{
    public static void main(String args[]){
        Overloaded_static_non_static obj = new Overloaded_static_non_static();
        obj.add(5,10);
    }
    // public static int add(int x, int y){
    //     System.out.println("demo "+(x+y));
    //     return x+y;
    // }
    public static int add(int x,byte y){
        System.out.println("first");
        return x+y;
    }
    public void add(int x, float y){
        // when the first demo add() is commeted out then this method is called because in data widening no data loss occurs
        System.out.println("Second");
        System.out.println(x+y);
        System.out.println("Calling a staic method from non-static context");
        test();
        System.out.println("Calling a non-staic method from non-static context");
        test2();
    }
    static void test(){
        System.out.println("I am staic test method.");
    }
    void test2(){
        System.out.println("I am non-static method.");
    }
    public void add(int x, double y){
        System.out.println("Third");
        System.out.println(x+y);
    }
}
// OUTPUT: 
// Second
// 15.0
// Calling a staic method from non-static context
// I am staic test method.
// Calling a non-staic method from non-static context
// I am non-static method.