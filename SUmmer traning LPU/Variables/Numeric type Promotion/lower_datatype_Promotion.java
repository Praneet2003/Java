class lower_datatype_Promotion{
    public static void main(String[] args) {
        byte a = 3;
        byte b = 2;
        // byte c = a+b; it gives the error because when we perform airthmetic operation on lower datatype that int, then it automatically promoted to int.
        byte c= (byte)(a+b);
        System.out.println(c);
    }
}