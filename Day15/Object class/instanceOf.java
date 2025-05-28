

class Parent{

}
class child1 extends Parent{

}
class child2 extends Parent{

}
public class instanceOf{
    public static void main(String[] args) {
        Parent p = new Parent();
        child1 c1 = new child1();
        child2 c2 = new child2();
        System.out.println(p instanceof Parent);
        System.out.println(c1 instanceof Parent);
        System.out.println(c2 instanceof Parent);
        System.out.println(p instanceof child1);
        System.out.println(p instanceof child2);
        p = c1;
        System.out.println("After Refferencing\n"+ (p instanceof child1));
        System.out.println(p instanceof child2);
        p = c2;
        System.out.println("After Second Refferencing\n"+(p instanceof child1));
        System.out.println(p instanceof child2);
    }
}