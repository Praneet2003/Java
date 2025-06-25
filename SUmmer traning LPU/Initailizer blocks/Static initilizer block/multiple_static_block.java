// Note: If you are have multiple static block within the same class then they will het executed accoding to the sequence top to bottom.
class multiple_static_block{
    static{
        System.out.println("this is also a static block");
    }
    public static void main(String[] args) {
        System.out.println("main method");
    }
    static{
        System.out.println("static block");
    }
}
// Output:
// this is also a static block
// static block
// main method