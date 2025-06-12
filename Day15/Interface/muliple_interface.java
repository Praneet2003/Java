interface Vehicle{//1st interface
    void start();
    void type();
    void company();
}
interface Properties{//2nd interface
    void SportsMode();
    void fourWheelDrive();
}
class Safari implements Vehicle,Properties{// implements both of the class, as follows the oops property multiple inheritance
    @Override
    public void start(){
        System.out.println("The car is started by push start/stop Button.");
    }
    @Override
    public void type(){
        System.out.println("This has a SUV type Body.");
    }
    @Override
    public void company(){
        System.out.println("Manufactured by TATA Motors.");
    }
    @Override
    public void SportsMode(){
        System.out.println("Sports Mode is Engaged.");
    }
    @Override
    public void fourWheelDrive(){
        System.err.println("4 X 4 Engaged.");
    }
}
class muliple_interface{
    public static void main(String[] args) {
        Safari obj = new Safari();
        obj.company();
        obj.type();
        obj.start();
        obj.SportsMode();
        obj.fourWheelDrive();
    }
}