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
class DerivedChild extends child{
    public DerivedChild(){
        System.out.println("This is the constructor of Derivedchild class havig no argumnets.");
    }
    public DerivedChild(int x, int y, int z){
        super(x,y);
        System.out.println("This is the constructor of child Derivedclass havig three argumnets. a: "+x+" b: "+y+" c: "+z);
    }
}
public class Multilevel_Inheritance_Constructor_Overloading{
    public static void main(String[] args) {
        DerivedChild d = new DerivedChild(10,20,30);
            // This is the constructor of parent class having one arguments as a: 20
            // This is the constructor of child class havig two argumnets x: 10 and y: 20
            // This is the constructor of child Derivedclass havig three argumnets. a: 10 b: 20 c: 30
    }
}