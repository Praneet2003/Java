// Static initializer block is used to initialize Static data members.
// It gets executed even before the main block/method.
class static_block{
    public static void main(String[] args) {
        System.out.println("Main block");
    }
    static{
        System.out.println("Static block");
    }
}
// output:
// Static block
// Main block