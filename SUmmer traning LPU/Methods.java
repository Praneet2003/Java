class Methods{
    public static void main(String[] rk){
	add(1, 2);
    }
    private static void add(float f, int x){
	System.out.println("Second");
    }
    public static void add(float d, double x)   // if you do int in place of float, it will not run
    {
	System.out.println("First");
    }
}
//Compilation Error

/*
	By default every Integer Literal in int.
	By default every Floating Point Literal is double

	byte -> short -> int -> long -> float -> double
*/