class Employee{
    int id = 101;// attribute 1.
    String name = "Praneet Raj";// attribute 2.
    void print(){// print is a method in class Employee.
        System.out.println("Employee having id: "+id+" name is: "+name);
    }
}
public class Customclass{
    public static void main(String[] args) {
        Employee xyz = new Employee();// instantiating or creating an object xyz for class Employee.
        xyz.print();
        xyz.name = "Mehul ";
        xyz.print();
    }
}