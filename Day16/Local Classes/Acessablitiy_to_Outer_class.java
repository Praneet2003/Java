class outer{
    private String language = "Java Programming";
    void greet(){
        System.out.println("Good morning guys!");
    }
    void localclass(){
        class inner{
            void display(){
                System.out.println("Hello i am the method of the local class!");
                // Acessing the language private string data member of outer class.
                System.out.println("Acessing the private data member of outer class: "+language+"\nAcessing the greet() method of outer class without requiring any instance: ");
                greet();
                // local class can acess all the members of outer class reghardless of the acess modifiers and the instance. 
            }
        }
        inner obj = new inner();
        obj.display();
    }
}
class Acessablitiy_to_Outer_class{
    public static void main(String[] args) {
        outer obj = new outer();
        obj.localclass();
    }
}