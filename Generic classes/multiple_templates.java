class Box<T1, T2>{
    private T1 a;
    private T2 b;
    public T1 get(T1 a){
        this.a = a;
        return a;
    }
}
class multiple_templates{
    public static void main(String[] args){
        Box<String, Integer> StringBox = new Box<>();
        // StringBox.set("Hello Generics");
        System.out.println("String Value: "+StringBox.get("praneet"));
        Box<Integer,String> intBox = new Box<>();
        // intBox.set(123);
        System.out.println("Integer Value: "+intBox.get(143));
    }
}