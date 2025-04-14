interface A{
    void peek();
    void seek();
    void run();
}
interface B{
    void peek();
    void cat();
    void sleep();
}
class emp implements A,B{
    @Override
    public void peek(){
        System.out.println("peek may be from A or B");
    }
    @Override
    public void seek(){
        System.out.println("Seek from interface A");
    }
    @Override
    public void run(){
        System.out.println("Run from interface A");
    }
    @Override
    public void cat(){
        System.out.println("cat from interface B");
    }
    @Override
    public void sleep(){
        System.out.println("Sleep for interface B");
    }
}
public class Ambiguity_multiple_inheritance{
    public static void main(String[] args) {
    emp obj = new emp();
    obj.peek();
    obj.seek();
    obj.run();
    obj.cat();
    obj.sleep();
    }
}