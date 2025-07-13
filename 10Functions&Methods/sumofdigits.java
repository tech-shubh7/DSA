import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int sum=0;

        while (number!=0){
            int lastdigit=number%10;
            sum=sum+lastdigit;
            number=number/10;
        }
        System.out.println(sum);
    }
}
