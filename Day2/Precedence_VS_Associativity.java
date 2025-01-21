class Precedence_VS_Associativity{
    public static void main(String[] args) {
        int a = 6*5 -34/2;
        /* here precedence comes into play
         *,/ have more precedence,so we will use 
        associativity here which is left to right in *,/
        6*5 = 30 then 34/2 = 17
         then 30- 17 = 13 ans */
        int b = 60/5 - 6*5;
        System.out.println(a);
        System.out.println(b);
        int c = ++a + -(b)*a;
        //here precidence will work hence ++ have more precedence than *.
        // 14 + 252
        System.err.println(c);
    }
}