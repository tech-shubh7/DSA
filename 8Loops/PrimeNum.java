import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        for (int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("not prime");
        }
        else {
            System.out.println(" prime");
        }
    }
}
