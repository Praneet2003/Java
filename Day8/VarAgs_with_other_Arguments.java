class VarAgs_with_other_Arguments{
    static void printVarArgs(float a,int b,int... arr){
        System.out.println("Printing n number of argument passed in varArgs.");
        float sum = 0;
        for(int i: arr){
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println("\nfirst argument is : "+a);
        System.out.println("Second argument is : "+b);
        sum/=arr.length;
        System.out.println("The average of sum of all the inputs are: "+sum);
    }
    public static void main(String[] args) {
        printVarArgs(12,45,67,89,90,56,78,67);
    }
}