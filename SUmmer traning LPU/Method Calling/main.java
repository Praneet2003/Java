class main{
    void main(){
        System.out.println("Main");
    }
    public main(){
        System.out.println("Main 2");
    }
    // static public main(){ Constructor can't be declared as static or final.
    //     System.out.println("Main 2");
    // }

    public static void main(String args[]){
        main obj = new main();
        obj.main();
    }
}