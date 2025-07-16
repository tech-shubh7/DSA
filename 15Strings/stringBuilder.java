public class stringBuilder {
//the main different betwen string class and stringbuilder class is
//    stringbuilder is mutable and string is not mutable

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb.toString());
        for(char ch='a';ch<='z';ch++){
        sb.append(ch);
        }
        System.out.println(sb);
    }}