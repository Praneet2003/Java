class Which_Method_called{
    public static void main(String args[]){
            // add(10,2);
    }
    private static void add(float x, int y){
        System.out.println("First");
        System.out.println(x+y);
    }
    public static void add(int x, double y){
        System.out.println("Second");
        System.out.println(x+y);
    }
}
// OUTPUT: 
// Which_Method_called.java:3: error: reference to add is ambiguous
//             add(10,2);
//             ^
//   both method add(float,int) in Which_Method_called and method add(int,double) in Which_Method_called match
// 1 error
// this error occured because both are equally compartable (both is having one one widening parameter).