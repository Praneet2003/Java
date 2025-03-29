class Array_declaration{
    public static void main(String[] args) {
        int [] marks;//Declaration of array marks
        marks = new int[5];// allocating memory to the array marks.
        int [] arr = new int[5]; // Declaration as well as memory allocation at once.
        int [] arr1 = {100,0,89,90,56};// Declaration as well as initialization.
        System.out.println("array lenght is: "+marks.length);
        int n = marks.length;
        System.out.println("Printing the elements of the array: ");
        for(int i=0;i<n;i++){
            System.err.print(arr1[i]+" ");
        }
        String [] names = {"Praneet", "Mehul","Ayush","Shivam","Bablu","Gurjit"};
        int n1 = names.length;
        System.out.println("\nMemebers of String array are: ");
        for(int i=0;i<n1;i++){
            System.err.print(names[i]+" ");
        }
        System.out.println("Reverse printing of array elements: ");
        for(int i=n1-1;i>=0;i--){
            System.out.println(names[i]);
        }
        System.err.println(arr1.toString());
    }
}