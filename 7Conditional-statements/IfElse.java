import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Enter your age : ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age>18){
            System.out.println("you are an adult bc now");
        }
        else {
            System.out.println("you are still in the shorts");
        }
    }
}
