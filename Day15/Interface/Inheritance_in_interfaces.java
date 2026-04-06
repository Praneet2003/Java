interface Sampleinterface{
    void meth1();
    void meth2();
}
// NOTE: you can do inheritance in java as 
interface childSampleinterface extends Sampleinterface{
    void meth3();
}
class Inheritance_in_interfaces{
    public static void main(String[] args) {
        childSampleinterface xyz = new childSampleinterface(){
            @Override
        public void meth1(){
        System.out.println("Hello I am Method 1 from Sample Interface.");
    }
        @Override
        public void meth2(){
            System.out.println("Hello I am Method 2 from Sample Interface.");
        }
        @Override
        public void meth3(){
            System.out.println("Hello I am Method 3 from childSampleinterface");
        }
        };
        xyz.meth1();
        xyz.meth2();
        xyz.meth3();
    }
}