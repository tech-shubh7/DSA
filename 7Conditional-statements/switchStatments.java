import java.util.Scanner;

public class switchStatments {
    public static void main(String[] args) {
        System.out.println("enter the day :");
        Scanner sc=new Scanner(System.in);
        String day=sc.nextLine();

        switch (day){
            case "sunday":
                System.out.println("sunday it is ");
                break;
            case "monday":
                System.out.println("monday it is ");
                break;
            case "tuesday":
                System.out.println("tuesday it is ");
                break;
            case "wednesday":
                System.out.println("wednesday it is ");
                break;
            case "thursday":
                System.out.println("thursday it is ");
                break;
            case "friday":
                System.out.println("friday it is ");
                break;
            case "saturday":
                System.out.println("saturday it is ");
                break;
            default:
                System.out.println("please enter correct day");
        }
    }
}
