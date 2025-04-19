class Employee{
    private int id;
    private String name;
    // here the constructor is overloaded.
    // one is having parameters and other does not.
    public Employee(String n, int x){
        System.out.println("Hi I am constructor having Two parameters.");
        id = x;
        name = n;
    }
    public Employee(){//constructors with different method signatures
        System.out.println("Hi I am constructor having no parameters.");
        id =101;
        name = "Praneet Raj";
    }
    public Employee(int x){
        System.out.println("Hi I am constructor having One parameters i.e ID.");
        id = x;
        name = "Ayush Gupta";
    }
    public Employee(String n){
        System.out.println("Hi I am constructor having One parameters i.e Name.");
        id = 78;
        name = n;
    }
    public void getDetails(){
        System.out.println("Name is: "+name+"\nid is: "+id);
    }
}
public class Constructor_Overloading{
    public static void main(String args[]){
        Employee E = new Employee();
        //object created without passing any arguments.
        E.getDetails();
        Employee em = new Employee("Mehul raj",45);
        //object created passing two arguments.
        em.getDetails();
        Employee E1 = new Employee(34);
        //object created passing one argument as id.
        E1.getDetails();
        Employee E2 = new Employee("Babalu kumar");
        //object created passing one arguments as name.
        E2.getDetails();
    }
}
