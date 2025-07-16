import java.util.Scanner;

public class PalidromeString {

    public static boolean isPalidrome(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
       String str=sc.next();
        int n=str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i)){
                //not a palidrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(isPalidrome());
    }


}
