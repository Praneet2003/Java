class outer{
    void show(){
        System.out.println("this the method of Outer class");
    }
    void nestedclass(){
        class inner{
            void display(){
                System.out.println("This is the method of local class");
            }
        }
        inner obj = new inner();
        obj.display();
    }
}
class Basic_local_class{
    public static void main(String[] args) {
        outer obj = new outer();
        obj.show();
        obj.nestedclass();
    }
}