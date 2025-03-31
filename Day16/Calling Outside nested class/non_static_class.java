class A{
    int age=22;
    public void show(){
        System.out.println("this is the show method in class A");
    }
    class B{
        public void display(){
            System.out.println("This is the display method in the class B");
        }
    }
}
public class non_static_class{
    public static void main(String args[]){
        A obj = new A();
        obj.show();
        // obj.display();
//         non_static_class.java:16: error: cannot find symbol
//         obj.display();
//            ^
//   symbol:   method display()
//   location: variable obj of type A
// 1 error
        A.B obj1 = obj.new B();
        // here A.B show that class B belongs to class A
        // and we are using obj.new because here class B is a part of A.
        obj1.display();
    }
}