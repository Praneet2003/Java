import java.io.*;
class our_own_printfunc{
    public static void main(String[] args) {
        Anshu.kumar.println("Hello World printed using custom print method");
    }
}
class Anshu{
    public static final PrintStream kumar = System.out;
}