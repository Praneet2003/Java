import java.util.Scanner;
class FIll_the_Names{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println("We will use printf print statement: ");
        System.out.printf("Dear %s Thanks a Lot! for your support.",a);
        // We will use printf print statement:        
        // Dear Praneet Thanks a Lot! for your support.
    }
}

// enum Shape {
//     SQUARE,
//     TRIANGLE
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the shape (SQUARE/TRIANGLE): ");
//         String shapeInput = sc.next().toUpperCase();

//         // Validate the shape input using the enum
//         if (isValidShape(shapeInput)) {
//             Shape shape = Shape.valueOf(shapeInput);

//             switch (shape) {
//                 case SQUARE:
//                     System.out.print("Enter the side length of the square: ");
//                     if (sc.hasNextDouble()) {
//                         double side = sc.nextDouble();
//                         System.out.println(String.format("Area of the square: %.2f", side * side));
//                     } else {
//                         System.out.println("Invalid Input: Please enter a numeric value for the side length.");
//                     }
//                     break;

//                 case TRIANGLE:
//                     System.out.print("Enter the base of the triangle: ");
//                     if (sc.hasNextDouble()) {
//                         double base = sc.nextDouble();
//                         System.out.print("Enter the height of the triangle: ");
//                         if (sc.hasNextDouble()) {
//                             double height = sc.nextDouble();
//                             System.out.println(String.format("Area of the triangle: %.1f", 0.5 * base * height));
//                         } else {
//                             System.out.println("Invalid Input: Please enter a numeric value for the height.");
//                         }
//                     } else {
//                         System.out.println("Invalid Input: Please enter a numeric value for the base.");
//                     }
//                     break;
//             }
//         } else {
//             System.out.println("Invalid Input: Please enter either 'SQUARE' or 'TRIANGLE'.");
//         }
//     }

//     // Method to validate if the shape input matches any enum value
//     private static boolean isValidShape(String shapeInput) {
//         for (Shape shape : Shape.values()) {
//             if (shape.name().equalsIgnoreCase(shapeInput)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
