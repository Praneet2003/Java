class Float_DecimalPoint{
    public static void main(String s[]){
        float f1 = 3.56789f;
        double d1 = 78.6736473785;
        //to print upto some specific Decimal places we use:- 
        //String.format("%.<decimal point needed>",<variable name>);
        System.out.print("Floating point number upto 2 decimal point: "+String.format("%.2f",f1));
        System.out.print("\nFloating point number upto 5 decimal point: "+String.format("%.5f",f1));
        System.out.print("\nDouble point number upto 2 decimal point: "+String.format("%.2f",d1));
    }
}