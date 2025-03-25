interface camera{
    void snap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning!!");
    }
    //default method is used to add functionalities to the interface,
    // and this method is common for all implementing class.
    // which is not necessarly overridden by the implementing class
    default void record4Kvideos(){
        System.out.println("Calling the Private method..");
        greet();// we can also use private data members or method inside our default method.
        System.out.println("Recording in 4K in DSLR......");
    }
}
interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class Mycellphone{
    void callNumber(int phonenumber){
        System.out.println("Calling...."+phonenumber);
    }
    void pickcall(){
        System.out.println("Connecting.....");
    }
}
class MysmartPhone extends Mycellphone implements camera,wifi{
    @Override
    public void snap(){
        System.out.println("Taking snap!!");
    }
    @Override
    public void recordVideo(){
        System.out.println("Recording video!!");
    }
    @Override
    public String[] getNetworks(){
        System.out.println("Getting list of networks.");
        String[] networklist = {"Praneet","Ayush","Mehul"};
        return networklist;
    }
    @Override 
    public void connectToNetwork(String network){
        System.out.println("Connecting to the "+network+" ......");
    }
    // @Override // you can override the default method when needed.
    // public void record4Kvideos(){
    //     System.out.println("Recording 4K videos in smartphone!!");
    // }
}
class default_methods_in_Interface{
    public static void main(String[] args) {
        MysmartPhone ms = new MysmartPhone();
        String[] ar = ms.getNetworks();
        for(String item : ar){
            System.out.println(item);
        }
        ms.connectToNetwork(ar[0]);
        ms.record4Kvideos();
        ms.callNumber(99055);
        ms.pickcall();
    }
}