class Experssion_evaluation{
    public static void main(String[] args) {
        int b = 1;
        int c = 4;
        int a = 5;
        //Math.pow() always returns double so we have to typecast it.
        int k = (int)Math.pow(b,2) - (4*a*c)/(2*a);
        System.out.println( "The value of the expression is : "+ k);
    }
}