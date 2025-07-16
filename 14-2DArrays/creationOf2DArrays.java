import java.util.Scanner;

public class creationOf2DArrays {

    public static boolean search(int nums[][],int key){
        for (int i = 0; i < nums.length; i++) {
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==key){
                    System.out.println("found at index"+"(" +i + "," + j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return  false;
    }

    public static void main(String[] args) {
        int  nums[][]=new int[3][3];
        int n=nums.length; //length of rows
        int m=nums[0].length; //length of columns
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<3;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<3;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        search(nums,7);
    }
}
