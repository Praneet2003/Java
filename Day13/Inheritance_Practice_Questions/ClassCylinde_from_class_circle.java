import java.util.Scanner;
class circle{
    public double r;
    public circle(double r){
        System.out.println("I am a parameterized Constructor of Circle.");
        this.r=r;
    }
    public double rad(){
        return Math.PI*r*r;
    }
}
class Cylinder extends circle{//cylinder inherited from circle
    public int h;
    public Cylinder(int height ,double r){
        super(r);
        System.out.println("I am parameterized constructor of Cylinder.");
        this.h = height;
    }
    public double volume(){
        double bArea = super.rad();// bottom and above area.
        return h*bArea;
    }
}
public class ClassCylinde_from_class_circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the height of the cylinder.");
        int h = sc.nextInt();
        System.out.println("Enter the radius of the cylinder.");
        double r = sc.nextDouble();
        Cylinder obj = new Cylinder(h,r);
        System.out.println("The volume of the cylinder is: "+String.format("%.2f",obj.volume()));
    }
}
// Enter the radius of the cylinder.
// 2
// I am a parameterized Constructor of Circle. 
// I am parameterized constructor of Cylinder. 
// The volume of the cylinder is: 50.27    
