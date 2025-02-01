class parent{
    public parent(){
        System.out.println("Hi i am the constructor of parent class.");
    }
    //NOTE: java does not have any destructor 
}
class child extends parent{
    public child(){
        System.out.println("Hi i am the constructor of child class.");
    }
}
public class Constructor_destructor_Sequence{
    public static void main(String[] args) {
        System.out.println("Creating an object of child class.");
        child c = new child();
    }
}