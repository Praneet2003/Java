class Employee{
    private int id;
    private String name;
    public Employee(){
        id = 45;
        name = "Mehul raj";
    }
    public void getDetails(){
        System.out.println("Name is: "+name+"\nid is: "+id);
    }
}
public class Non_Parameterised_constructor{
    public static void main(String args[]){
        Employee em = new Employee();
        em.getDetails();
    }
}