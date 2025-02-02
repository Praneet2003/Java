import java.util.*;
class Add_Two_MutiDimensional_Array{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements of 2D array1 of 2X3: ");
    int arr1[][] = new int[2][3];
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            arr1[i][j]= sc.nextInt();
        }
    }
    int arr2[][] = new int[2][3];
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            arr2[i][j]= sc.nextInt();
        }
    }
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            arr1[i][j]+= arr2[i][j];
        }
    }
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            System.out.print(arr1[i][j]+" ");
        }
        System.out.println("");
    }
    }
}