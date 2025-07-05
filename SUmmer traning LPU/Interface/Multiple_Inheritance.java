interface UGC{
    void takeadmission();
}
interface AICTE{
    void takeadmission();
}
class Multiple_Inheritance implements UGC, AICTE{
    @Override
    public void takeadmission(){
        System.out.println("Admissions are Open.");
    }
    public static void main(String args[]){
        Multiple_Inheritance obj = new Multiple_Inheritance();
        obj.takeadmission();
    }
}
