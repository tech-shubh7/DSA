import java.util.Scanner;

public class PractiseQsDay5 {
    public static void main(String[] args) {
        //Question1
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers for finding avg");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d=(double)(a+b+c)/3;
        System.out.println("Avg of 3 numbers is "+d);

        //Question2
        System.out.println("enter side value for area of square");
        double side=sc.nextDouble();
        double area=side*side;
        System.out.println("Area of Square is "+area);

        //Question3
        System.out.println("Enter cost of pencil,pen and eraser respectively");
        float pencilCost=sc.nextFloat();
        float penCost=sc.nextFloat();
        float eraserCost=sc.nextFloat();
        float totalBill=pencilCost+penCost+eraserCost;
        float gst=(totalBill*18)/100;
        System.out.println("gst is "+gst);
        System.out.println("Total bill is "+ (totalBill+gst));


        //Question4
        byte bt=4;
        char ch='a';
        short sh=512;
        int in=1000;
        float fl=3.14f;
        double db=99.9954;
       double result = (fl*bt) + (in%ch) - (db*sh);

    }
}
