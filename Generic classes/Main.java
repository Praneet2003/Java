class Box<T>{ // <> this is known as dimond operator.
    private T value;
    public void set(T value){
        this.value = value;
    }
    public T get(){
        return value;
    }
}
class Main{
    public static void main(String[] args){
        Box<String> StringBox = new Box<>();
        StringBox.set("Hello Generics");
        System.out.println("String Value: "+StringBox.get());
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println("Integer Value: "+intBox.get());
    }
}