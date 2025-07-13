import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;

        do {
            System.out.println("enter the number ");
            number=sc.nextInt();

            if(number%2==0)
                 evenSum=evenSum+number;
            else
                oddSum=oddSum+number;

            System.out.println("DO you wanta to continue? Press 1 for yes or 0 for no ");
            choice=sc.nextInt();
        }while (choice==1);

        System.out.println("Even sum : "+evenSum);
        System.out.println("Odd sum : "+oddSum);
    }
}
