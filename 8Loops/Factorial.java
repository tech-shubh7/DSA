import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find" +
                " factorial ");

        int num=sc.nextInt();
        int facorial=1;
        if(num==0){
            facorial=1;
        }
//       for (int i=1;i<=num;i++){
//           facorial=facorial*i;
//       }
        while (num>0){
            facorial=facorial*num;
            num--;
        }
        System.out.println(facorial);
    }
}
