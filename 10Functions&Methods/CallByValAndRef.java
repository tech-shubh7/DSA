//Call by Value and Call By Reference
//Java always calls by value
//call by reference is not used in whole java all functions use call by value in java
//call by value concept is when we pass argument in function like swap(a,b) then
//the copy variable of a and b will be given to the swap function java will never pass
//the original value of a and b defined in main function so whatever the change in a and b happen
//it will be limited to the swap function but original a and b value in main fn will not change
import java.util.Scanner;
public class CallByValAndRef {

    public static void swap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a = ");
        int a=sc.nextInt();
        System.out.print("Enter value of b = ");
      int b=sc.nextInt();
        //logic
        int temp=a;
        a=b;
        b=temp;

        System.out.println("Value of a after swapping = "+a);
        System.out.println("Value of b after swapping = "+b);
    }
    public static void main(String[] args) {
           swap();
    }
}
