public class DecimalToBinary {

    public static void decimaltobinary(int n){
        int DecimalNumber=n;
            int power=0;
            int binaryNumber=0;
        while (n>0){
            int reminder=n%2;
            binaryNumber=binaryNumber+ (reminder * (int)Math.pow(10,power));
           power++;
           n=n/2;
        }
        System.out.println("Binary Form of "+ DecimalNumber + " = "+binaryNumber);
    }

    public static void main(String[] args) {
            decimaltobinary(10);
            decimaltobinary(7);
            decimaltobinary(5);
    }
}
