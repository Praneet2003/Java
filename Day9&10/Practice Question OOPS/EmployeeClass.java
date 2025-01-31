import java.util.*;
class Employee{
    int Salary;
    String Name;
    int getSalary(){
            return Salary;
    }
    void SetName(String n){
        Name=n;
    }
    String getName(){
        return Name;
    }
}
public class EmployeeClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee em = new Employee();
        System.out.println("Enter the salary: ");
        em.Salary=sc.nextInt();
        // When you use sc.nextInt() to read the salary, 
        // it only consumes the integer input but does not consume 
        // the newline character (\n) that is left in the input buffer. 
        // So when sc.nextLine() is used to read the employee's name, 
        // it immediately reads the leftover newline instead of waiting for user input.
        sc.nextLine();
        System.out.println(" and name of the employee: ");
        em.Name = sc.nextLine();
        System.out.println("Name of the employee is "+em.getName());
        System.out.println("Salary of the employee is "+em.getSalary());
        System.out.println("Ops!! thier is a mistake in name , changing the name. \n Enter the correct name of employee.");
        String newName = sc.nextLine();
        em.SetName(newName);
        System.out.println("Correted Name of the employee is "+em.getName());
        System.out.println("Salary of the employee is "+em.getSalary());
    }
}
// Enter the salary: 
// 89078
//  and name of the employee:
// Praneet
// Ops!! thier is a mistake in name , changing the name.
// Ops!! thier is a mistake in name , changing the name.
// Praneet Raj
// Correted Name of the employee is Praneet Raj
// Salary of the employee is 89078