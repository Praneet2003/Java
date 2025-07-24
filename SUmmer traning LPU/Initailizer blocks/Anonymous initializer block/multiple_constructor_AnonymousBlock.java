class multiple_constructor_AnonymousBlock{
    public multiple_constructor_AnonymousBlock(){
        System.out.println("First Constructor");
    }
    public multiple_constructor_AnonymousBlock(int x){
        System.out.println("Second Constructor");
    }
    {//anonymous block 1st.
        System.out.println("Hello i am also an Anonymous block");
    }
    {//annonymous block 2nd.
        System.out.print("Hello world i am with the ");
    }
    public static void main(String[] args) {
        multiple_constructor_AnonymousBlock obj = new multiple_constructor_AnonymousBlock();
        multiple_constructor_AnonymousBlock obj1 = new multiple_constructor_AnonymousBlock(1);
    }

}