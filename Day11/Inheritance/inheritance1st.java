class base{
    public int x;
    public int getx(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am setting a new X Now ");
        this.x = x;
    }
    public base(){
        System.out.println("I am a constructor of base class.");
    }
}
class derived extends base{
    public int y;
    public int gety(){
        return y;
    }
    public void setY(int x){
        System.out.println("I am setting a new Y Now");
        this.y = x;
    }
    public derived(){
        System.out.println("I am a constructor of derived class.");
    }
}
public class inheritance1st{
    public static void main(String[] args) {
        base b = new base();// b object of base class have different memeory address.
        b.setX(4);
        System.out.println("Getting the value of x from base class directly is: "+b.getx()+"\n");
        derived d = new derived();// d object of base class have different memeory address can acess data members of base class..
        d.setY(56);
        System.out.println("Getting the value of y from derived class directly is: "+d.gety()+"\n");
        System.out.println("Acessing the datamember x of base class, from the derived class\n");
        d.setX(98);
        System.out.println("using derived class object: "+d.getx());
        System.out.println(b.getx()+" "+d.getx());
    }
}