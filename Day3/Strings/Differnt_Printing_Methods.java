class Differnt_Printing_Methods{
    public static void main(String[] args) {
        // 1. using System.out.print()
        //  this method is used to print without getting new line at end
        int a = 20;
        float b = 3.9885f;
        System.out.print("System.out.print(): "+a+" ");
        System.out.print(String.format("%.2f",b));
        //Output:  System.out.print(): 20 3.99
        
        // 2. using System.out.prinln()
        // this method is used to print and get newline at end.
        System.err.println("");
        System.out.println("using System.out.println(): " + a);
        System.out.println(" using System.out.println(): "+ String.format("%.3f",b));
         //   using System.out.println(): 20   
         //  using System.out.println(): 3.98

        // 3. Using System.out.printf()
        // tis method is similar to printf() in c language.
        char ch = 'A';
        String str = "Hello world!!!";
        System.out.printf("Using System.out.printf int data: %d",a);
        System.out.printf("\nUsing System.out.printf float data: %.2f",b);
        System.out.printf("\nUsing System.out.printf char data: %c",ch);
        System.out.printf("\nUsing System.out.printf string data: %s",str);
        System.out.printf("Decimal formating in printf() %8.2f",b);//Decimal formating in printf()     3.99
        System.out.println("\nin above statement '%8.2f' Specifies that there must be 8 digit before decimal and 2 digits after decimal.");
            //Using System.out.printf int data: 20
            // Using System.out.printf float data: 3.99
            // Using System.out.printf char data: A
            // Using System.out.printf string data: Hello world!!!
        // 4.  System.out.format()
        // System.out.format() is similar to System.out.printf();
        int number = 42;
        String name = "Alice";
        System.out.format("Using System.out.format()");
        System.out.format("The number is: %d%n", number);
        System.out.format("Hello, %s!%n", name);
    }
}