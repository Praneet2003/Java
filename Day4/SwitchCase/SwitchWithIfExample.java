import java.util.Scanner;

class SwitchWithIfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (1-5): ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("You chose 1.");
                if (number % 2 != 0) {
                    System.out.println("1 is an odd number.");
                }
                break;

            case 2:
                System.out.println("You chose 2.");
                if (number % 2 == 0) {
                    System.out.println("2 is an even number.");
                }
                break;

            case 3:
                System.out.println("You chose 3.");
                if (number > 0) {
                    System.out.println("3 is a positive number.");
                }
                break;

            case 4:
                System.out.println("You chose 4.");
                System.out.println("Enter another number to compare with 4: ");
                int compareNumber = sc.nextInt();
                if (compareNumber > 4) {
                    System.out.println(compareNumber + " is greater than 4.");
                } else if (compareNumber < 4) {
                    System.out.println(compareNumber + " is less than 4.");
                } else {
                    System.out.println(compareNumber + " is equal to 4.");
                }
                break;

            case 5:
                System.out.println("You chose 5.");
                if (number % 5 == 0) {
                    System.out.println("5 is divisible by itself.");
                }
                break;

            default:
                System.out.println("Invalid number! Please enter a number between 1 and 5.");
        }
    }
}
