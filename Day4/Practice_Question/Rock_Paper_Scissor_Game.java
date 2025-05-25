import java.util.Scanner;
class Rock_Paper_Scissor_Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String player1 = sc.next();
        String player2 = sc.next();
        System.out.println("input by player 1: "+ player1);
        System.out.println("input by player 2: "+ player2);
        if (player1.equals(player2)) {
            System.out.println("Draw");
        } else if (
            (player1.equals("rock") && player2.equals("scissor")) ||
            (player1.equals("paper") && player2.equals("rock")) ||
            (player1.equals("scissor") && player2.equals("paper"))
        ) {
            System.out.println("Player1 wins");
        } else {
            System.out.println("Player2 wins");
        }
        // if(player1.equalsIgnoreCase(player2)){
        //     System.out.println("Draw");
        // }else if(player1.equalsIgnoreCase("Paper") && player2.equalsIgnoreCase("Scissor")){
        //     System.out.println("Player2 wins");
        // }else if(player1.equalsIgnoreCase("paper") && player2.equalsIgnoreCase("rock")){
        //     System.out.println("Player1 wins"); 
        // }else if(player1.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("Scissor")){
        //     System.out.println("Player1 wins");
        // }else if(player1.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("paper")){
        //     System.out.println("Player2 wins");
        // }else if(player2.equalsIgnoreCase("scissor") && player1.equalsIgnoreCase("paper")){
        //     System.out.println("Player1 wins");
        // }else if(player2.equalsIgnoreCase("scissor") && player1.equalsIgnoreCase("rock")){
        //     System.out.println("Player2 wins");
        // }else{
        //     System.out.println("Invalid choice");
        // }
    }
}