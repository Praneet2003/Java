class Employee{
    private int id;
    private String name;
    public Employee(String n, int x){
        id = x;
        name = n;
    }
    public void getDetails(){
        System.out.println("Name is: "+name+"\nid is: "+id);
    }
}
public class Parametrized_Constructor{
    public static void main(String args[]){
        Employee em = new Employee("Mehul raj",45);
        em.getDetails();
    }
}