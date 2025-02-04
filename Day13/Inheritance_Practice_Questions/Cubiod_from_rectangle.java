import java.util.*;
class rectangle{
    public int area(int l,int b){
        return l*b;
    }
}
class Cuboid extends rectangle{
    int h;
    int l;
    int b;
    public Cuboid(int l, int b,int h){
        this.h = h;
        this.l = l;
        this.b = b;
    }
    public void Cuboid_area(){
        int lb = super.area(l,b);
        int bh = super.area(b,h);
        int lh = super.area(l,h);
        System.out.println("The area of the cuboid is: "+ 2*(lb+bh+lh));
    }
    public void volume_of_cubiod(){
        System.out.println("the volume of the cubiod is"+ l*b*h);
    } 
}
public class Cubiod_from_rectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght, width and height of Cuboid: ");
        int l,b,h;
        l =sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        Cuboid a = new Cuboid(l,b,h);
        a.Cuboid_area();
        a.volume_of_cubiod();
    }
}