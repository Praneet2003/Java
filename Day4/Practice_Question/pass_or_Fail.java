import java.util.*;
class pass_or_Fail{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mth= sc.nextInt();
        float phy= sc.nextInt();
        float chem= sc.nextInt();
        mth = (mth*10)/8;
        phy = (phy*10)/8;
        chem = (chem*10)/8;
        float total = (((mth*8/10)+(phy*8/10)+(chem*8/10))*100)/240;
        if(mth>33.0 && phy>33.0 && chem>33.0){// if all subject have marks more than 33 then pass
            System.out.println("The student is pass in all three subjects. ");
            if(total>40.0){// if total precentage is 
                System.out.println("The student is Qualified for next Semester.");
            }else{
                System.out.println("The student is Disualified for next Semester.");
            }
        }else{
            System.out.println("The student is not pass (failed) in subject/s. ");
        }
        System.out.println("If you want to know the marks press 1");
        byte num = sc.nextByte();
        if(num==1){
            System.out.println("If you want to know the marks, for maths, press 1 , for physics press 2, for chemistry press 3, for all subjects press 4, otherwise press any other key");
            byte choice = sc.nextByte();
            switch(choice){
            case 1:
                System.out.println("your percentage in maths is: "+ mth);
                break;
            case 2:
                System.out.println("your percentage in physics is: "+ phy);
                break;
            case 3:
                System.out.println("your percentage in chemistry is: "+ chem);
                break;
            case 4:
                    System.out.println("your percentage in maths is: "+ mth);
                    System.out.println("your percentage in physics is: "+ phy);
                    System.out.println("your percentage in chemistry is: "+ chem);
                break;
            default:
                System.out.print("thak you for visiting us!");
            }
        }
    }
}