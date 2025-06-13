interface piramid{
    void display();
}
class pyramid_pattern_using_ananymous_class{
    public static void main(String[] args) {
        int n = 5;
        piramid pattern = new piramid(){
            @Override
            public void display() {
                for (int i = 1; i <= n; i++) {
                    // print spaces
                    for (int j = i; j < n; j++) {
                        System.out.print(" ");
                    }
                    // print stars
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        };
        pattern.display();
    }
}