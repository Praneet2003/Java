// Anannomous classes are those classes which are defined and implemented in same line
interface A{
    void seek();// interface having by default public abstract method
}
class outer{
    void call(){
        A obj = new A(){
            public void seek(){//here we are not creating the actual object for the interface but it seems to be an object.
                System.out.println("Hello World");
            }
        };
        obj.seek();
    }
}
class Anonymousclass{
    public static void main(String[] args) {
        A obj = new A(){
            public void seek(){
                System.out.println("Hello");
            }
        };
        obj.seek();
        outer objclass = new outer();
        objclass.call();
    }
}
