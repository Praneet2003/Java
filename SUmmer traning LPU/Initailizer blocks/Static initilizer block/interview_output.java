class interview_output{
    static int x;
    static{
        x++;
    }
    {
        x++;
    }
    interview_output(){
        x+=2;
    }
    public static void main(String[] args) {
        interview_output obj = new interview_output();
        System.out.println(x++);
    }
}