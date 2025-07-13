import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to reverse a number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int lastdigit;
        while(n>0) {
             lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
    }
}
