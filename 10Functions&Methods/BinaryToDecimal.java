public class BinaryToDecimal {

    public static void ConvertBtoD(int n){
        int Binarynum=n;
      int power=0;
      int decNum=0;

      while (n>0){
          int lastDigit=n%10;
          decNum=decNum+(lastDigit *(int)Math.pow(2,power));

          power++;
          n=n/10;
       }
        System.out.println("Decimal of "+ Binarynum + " = "+ decNum);

    }
    public static void main(String[] args) {
        ConvertBtoD(1001);
        ConvertBtoD(111);
           }
}
