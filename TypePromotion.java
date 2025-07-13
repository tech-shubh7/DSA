public class TypePromotion {

    //java automatically promotes each byte short or char operand to int when evaluating an expression
    //if one operand is long float or double the whole expression is promoted to long float or double respectively.
    public static void main(String[] args) {
        char a='a';
        char b='b';
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(a-b);

        short s=5;
        byte d=25;
        char e='c';
        byte bt=(byte)(s+d+e);
        System.out.println(bt);

        int in=10;
        float fl=20.77f;
        long ln=77;
        double db=30;
        double ans=in+fl+ln+db;
        System.out.println(ans);


    }
}
