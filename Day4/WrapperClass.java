// Wrapper class allows primitive data type tp be treated as an object.
// Wrapper class is used for acessing different type of method by using class objects.
// which was unabled to acess using noraml variables.
// Wrapper class uses Autoboxing and unboxing.
// Autoboxing converts primitive data type into correspomding wrapper class.
// Unboxing converts wrapperclass into its corresponding primitive dtata type.
class WrapperClass{
    public static void main(String[] args) {
        int a = 3;
        Integer obj = 3;// how you know that Integer is a class, by default we assume that the class name starts always with a capital letter
        // System.out.println("FloatValue for int data type a: "+ a.floatValue()); gives error that compiler is unable to derefrence it.
        System.out.println("Value of object of Integer class: "+ obj.floatValue());
        char C = 'H';
        String str = "hello world"; 
        Character Ch = 'A';
        System.out.println(Ch.charValue());
        System.out.println(str.length());
    }
}
// how to run you program in cmd prompt
// javac <filename>.java 
// this above line converts source code into byte code  
// java <class name><arguments needed> 
// this above line converts byte code into machine code.
