import java.util.*;
class Cylinder{
    final float pi = 3.14f;
    // or we acan use Math.PI.
    private int r;
    private int h;
    public Cylinder(int r, int h){
        this.r = r;
        this.h = h;
    }
    public void Area(){
        float sum = 2*pi*r*h + 2*pi*r*r;
        System.out.println("The area of the cylinder is: "+String.format("%.2f",sum));
    }
    public void Volume(){
        float vol = pi*r*r*h;
        System.out.println("The volume of the cylinder is: "+String.format("%.2f",vol));
    }
}
public class Cylinder_Area_Perimeter_Cal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder.");
        int r = sc.nextInt();
        System.out.println("Enter the height of the cylinder.");
        int h = sc.nextInt();
        Cylinder cn = new Cylinder(r,h);
        cn.Area();
        cn.Volume();
    }
}