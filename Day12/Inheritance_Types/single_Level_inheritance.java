class base{
    public base(){
        System.out.println("Hi this is the constructor of base class.");
    }
    int a,b;
}
class derived extends base{
    int c,d;
    public derived(){
        System.out.println("Hi this is the constructor of derived class.");
    }
    public void initdata(int a, int b,int c,int d){
        super.a = a;
        super.b = b;
        this.c = c;
        this.d = d;
    }
    public void getdata(){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
    }

}
class child1 extends derived{
    public child1(){
        System.out.println("Hi this is the constructor of child1 class.");
    }
}
class single_Level_inheritance{
    public static void main(String args[]){
        derived obj = new derived();
        obj.initdata(10, 20, 30, 40);
        obj.getdata();
        child1 obj1 = new child1();
    }
}