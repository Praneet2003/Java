import java.util.*;
class MultiDimensional_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements of the 2D array: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Displaying flat price in lakh floor wise: ");
        int [][] flatPrice = {{80,70,75},{72,69,67},{62,57,55},{50,51,49},{45,42,40}};
        for(int i=0;i<5;i++){
            System.out.print("floor no : "+i+"Prices are: ");
            for(int j=0;j<3;j++){
                System.out.print(flatPrice[i][j]+" ");
            }
            System.err.println("");
        }
    }
}
// 1 20 40 50 60 79
// Elements of the 2D array:
// 1 20 40
// 50 60 79
// Displaying flat price in lakh floor wise:
// floor no : 0Prices are: 80 70 75
// floor no : 1Prices are: 72 69 67
// floor no : 2Prices are: 62 57 55
// floor no : 3Prices are: 50 51 49
// floor no : 4Prices are: 45 42 40