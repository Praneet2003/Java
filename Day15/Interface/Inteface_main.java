// interface cannot be instantiated.
// there is no constructor in interface.
interface Bycycle{
    int a = 10;// by default it is static and final.
    void Applybreak();
    void speedup();
}
class Avon implements Bycycle{
    @Override
    public void Applybreak(){
        System.out.println("Applying breaks of the Bycycle.");
    }
    @Override
    public void speedup(){
        System.out.println("Speeding up the Bycycle.");
    }
}
class Inteface_main{
    public static void main(String[] args) {
        Avon obj = new Avon();
        obj.Applybreak();
        obj.speedup(); 
        System.out.println(obj.a);
        System.out.println(((Object) obj.a).getClass().getSimpleName());
        //NOTE: you can add the data members or properties in the interface But, 
        // you cannot modify them because by default they are static and final variables.
        // obj.a +=10;
        // System.out.println(obj.a);
    }
}