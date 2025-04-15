class A{
    public void show(){
        System.err.println("In the show method!!");
    }
}
class Basic_Ananonmous_Class{
    public static void main(String[] args) {
        A obj = new A(){
            //here this is an anannomous class with no class or the class name.
            public void show(){
                System.out.println("In the new Show method!!");
            }
        };
        obj.show();
    }
}