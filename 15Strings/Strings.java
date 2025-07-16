import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
         char arr[]={'a','b','c','d'};
         String str="abcd";
         String str2=new String("xyz");
        System.out.println(arr);
        System.out.println(str);
        System.out.println(str2);
         //strings in java are immutable so we cannot change it
        Scanner sc=new Scanner(System.in);
        String name;
        //sc.next only takes on words like if you enter shubh patel still i will only take shubh
        //sc.nextLine is solution which takes whole line as input like this whole line i am writing it can take as input

     //   name=sc.next();
        String sentence=sc.nextLine();
       // System.out.println(name);
        System.out.println(sentence);
        System.out.println(sentence.length());
        System.out.println(sentence.concat(str));
        System.out.println(sentence.charAt(1)); //index starts from 0
    }
}
