import java.util.Scanner;

public class PalidromeNumb {
    public static void ispalidrome(int number){
        int palidrome=number;
        int reverse=0;

        while (palidrome>0){
            int rem=palidrome%10;
            reverse=reverse*10+rem;
            palidrome=palidrome/10;
        }
        if(number==reverse)
            System.out.println("yes");
        else
            System.out.println("no");
    }
    public static void main(String[] args) {

        ispalidrome(777);
        ispalidrome(7535);
        ispalidrome(121);
    }
}
