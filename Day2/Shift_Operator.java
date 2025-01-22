class Shift_Operator{
    public static void main(String[] args) {
        int num = 58;
        // System.out.print("Left shift by 2: "+ num << 2);//gives error because
        // the << (left shift) operator has lower precedence than the + operator.
        //this is the correct way below.
        System.out.print("Left shift by 2: " + (num << 2));
        System.out.print("\nThe number is now: "+ num);
        //The original number does not change on shifting.
        System.out.print("\nRight shift by 2: "+(num>>2));
    }
}