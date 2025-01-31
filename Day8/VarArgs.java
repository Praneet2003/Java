class VarArgs{// varargs just takes an arbitrary number of argument as a parameter in a function.
    static void printVarArgs(int... arr){
        System.out.println("Printing n number of argument passed in varArgs.");
        float sum = 0;
        for(int i: arr){
            System.out.print(i+" ");
            sum+=i;
        }
        sum/=arr.length;
        System.out.println("The average of sum of all the inputs are: "+sum);
    }
    public static void main(String[] args) {
        printVarArgs(12,45,67,89,90,56,78,67);
    }
}