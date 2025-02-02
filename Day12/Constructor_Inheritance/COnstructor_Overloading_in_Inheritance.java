class parent{
    public parent(){
        System.out.println("This is the constructor of parent class having no arguments.");
    }
    public parent(int a){
        System.out.println("This is the constructor of parent class having one arguments as a: "+a);
    }
}
class child extends parent{
    public child(){
        super(5);
        System.out.println("This is the constructor of child class havig no argumnets.");
    }
    public child(int x, int y){
        super(y);
        System.out.println("This is the constructor of child class havig two argumnets x: "+x+" and y: "+y);
    }
}
public class COnstructor_Overloading_in_Inheritance{
    public static void main(String[] args) {
        child c1 = new child();
        //whitout super keyword.
            // This is the constructor of parent class having no arguments.
            // This is the constructor of child class havig no argumnets.
        child c2 = new child();
        // with super keyword: super(5)
            // This is the constructor of parent class having one arguments as a: 5
            // This is the constructor of child class havig no argumnets.
        child c3 = new child(25,35);
        // without super keyword.
            // This is the constructor of parent class having no arguments.
            // This is the constructor of child class havig two argumnets x: 25 and y: 35
        child c4 = new child(45,65);
        // with super keyword: super(y);
            // This is the constructor of parent class having one arguments as a: 65
            // This is the constructor of child class havig two argumnets x: 45 and y: 65  
    }
}