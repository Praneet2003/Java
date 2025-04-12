class A{
    @Override
    public String toString(){
        return "Hello i am Overrided toString() function";
    }
    public boolean equals(A obj){
        
    }
}
class intro{
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.toString());
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj));
        // System.out.println(obj.notifyAll());
    }

}