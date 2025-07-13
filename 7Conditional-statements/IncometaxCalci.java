import java.util.Scanner;

public class IncometaxCalci {
    public static void main(String[] args) {

        System.out.println("enter your yearly income :");
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        if(income<500000){
            System.out.println("0% tax");
        } else if (income>500000&&income<1000000) {
            System.out.println("20% tax");
        }
        else {
            System.out.println("30% tax");
        }
    }
}
