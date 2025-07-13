import java.util.Scanner;

public class AvgOf3Numbers {
    public static void FindAvg(){
        Scanner sc=new Scanner(System.in);
      int  a=sc.nextInt();
       int  b=sc.nextInt();
        int c=sc.nextInt();

        int avg=(a+b+c)/3;
        System.out.println("avg of 3 nums is " + avg);
    }

    public static void main(String[] args) {
        FindAvg();
        FindAvg();
    }

}
