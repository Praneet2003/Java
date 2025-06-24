class varDemo1{
    static int x;
    public static void main(String[] args) {
        // int x;//not initialized
        System.out.println(x);//here it tries to print loacal variable x
    }
}
//give compilation error.