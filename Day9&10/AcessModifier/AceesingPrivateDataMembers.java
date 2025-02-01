import java.util.*;
class Acess{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int x){
        id = x;
    }
    public int getId(){
        return id;
    }
}
public class AceesingPrivateDataMembers{
    public static void main(String args[]){
        Acess p1 = new Acess();
        // p1.name = "Praneet";
        // p1.id = 101;
        // This will give an error because we are trying to acess 
        // the private data members.
        p1.setId(101);
        p1.setName("Praneet Raj");
        System.out.println(p1.getId());
        System.out.println(p1.getName());
    }
}