public class SwitchWithString {
    public static void main(String[] args) {
        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("Start of the work week!");
                break;
            case "Friday":
                System.out.println("Almost the weekend!");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Midweek hustle.");
        }
    }
}
