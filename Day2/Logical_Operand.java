class Logical_Operand{
    public static void main(String[] args) {
        boolean a = false;
        int num = 5;
        System.err.println(!a);
        // using ternatry operator.
        System.out.println("Logical AND on (num>5 && num<20): "+(num>5 && num<20));
        System.out.println("Logical OR on (num>5 || num<20): "+(num>5 || num<20));
    }
}