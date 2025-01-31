import java.util.*;
class Square{
    int s;
    public Square(int n) {
        System.out.println("Initializing using constructor.");
        s = n;
    }
    int printArea(){
        return s*s;
    }
    int printPerimeter(){
        return 4*s;
    }
}
public class SquareClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length of square: ");
        int n = sc.nextInt();
        Square s = new Square(n);
        System.out.println("Area of the square is: "+s.printArea());
        System.out.println("Perimeter of the square is: "+s.printPerimeter());
    }
}