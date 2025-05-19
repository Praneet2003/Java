class static_nested_class{
    static public class innerclass{
        void display(){
            System.err.println("This is the inner static class");
        }
    } 
    public static void main(String[] args) {
        System.err.println("Calling from the same outer class");
        innerclass obj = new innerclass();
        obj.display();
    }
}