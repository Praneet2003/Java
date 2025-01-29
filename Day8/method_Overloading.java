// metjod overloading: when two or more methods is made with a same name but different number of arguments.
class method_Overloading{
    static void foo(){
            System.out.println("Good morning bro");
        }
        //here we are overloading the method foo()
        static int  foo(int a){
            return a;
        }
        static float foo(float a){
            return a;
        }
    public static void main(String[] args) {
        foo();
        int a = foo(98);
        System.out.println(a);
        float z = foo(45.89f);
        System.out.println(z);
    }
}